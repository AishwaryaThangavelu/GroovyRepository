/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aish.vaishno.springgroovy.dao

import org.springframework.stereotype.Service;
import javax.persistence.PersistenceContext;
import javax.persistence.EntityManager
import org.springframework.transaction.annotation.Transactional;
import javax.persistence.Query;
import aish.vaishno.springgroovy.pojo.GreWordListDetails

/**
 *
 * @author Aishu
 */
@Service(value="Service")
@Transactional
class GreWordListDao {
    
    @PersistenceContext(unitName = "GreWordListPU")
    EntityManager entityManager;
    
    @Transactional(readOnly = false)
    def getWordList(){
            println " I am in the DAO class";
            
        List<GreWordListDetails> wordList=entityManager.createQuery("select c from GreWordListDetails c").getResultList();
            wordList.each{
                println it;
            }
            println wordList.get(0);
            return wordList;
    }
    
    
    def getSingleWordMeaning(Integer greId){
        Query query=entityManager.createQuery("select c from GreWordListDetails c where c.greId =:greId").setParameter("greId",greId);
        GreWordListDetails greWordListDetails=(GreWordListDetails)query.getSingleResult();
        println greWordListDetails;
        greWordListDetails;
    }
    
    def insertWord(GreWordListDetails greWordListDetails){
        entityManager.persist(greWordListDetails);
        entityManager.flush();
        println "Insert successful";
    }
	
}