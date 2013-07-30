/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aish.vaishno.springgroovy.executer

import aish.vaishno.springgroovy.pojo.GreWordListDetails
import aish.vaishno.springgroovy.dao.GreWordListDao
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 *
 * @author Aishu
 */
class Executer{
    
    def test(){
        println "Hi...."
    }
    
    static void main(def args){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("META-INF/SpringGroovy-Context.xml")
        GreWordListDao greWordListDao=(GreWordListDao)applicationContext.getBean("Service");
              
                    // INSERT       
    /*  GreWordListDetails greWordListDetails=new GreWordListDetails();
      greWordListDetails.greId=500;
      greWordListDetails.greWord='insane';
      greWordListDetails.greWordMeaning='foolish';
      
      greWordListDao.insertWord(greWordListDetails);
      */
      
                // WordList
       println greWordListDao.getWordList();  
      
                // Particular Word
        //  println greWordListDao.getSingleWordMeaning(1);
     
        
        }
	
}

