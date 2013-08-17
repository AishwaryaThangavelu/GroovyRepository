/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aish.vaishno.springgroovy.pojo

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id


/**
 *
 * @author Aishu
 */
@Entity
@Table(name="gre_wordlist")
class GreWordListDetails {

    @Id
    @Column(name="gre_id")
    Integer greId;
    
    @Column(name="gre_word")
    String greWord;
    
    @Column(name="gre_word_meaning")
    String greWordMeaning;
    
    @Override
    public String toString() {
        return "GreWordListJava{" + "greId=" + greId + ", greWord=" + greWord + ", greWordMeaning=" + greWordMeaning + '}';
    }
    
}
