/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aish.vaishno.twittergroovy.executer

import twitter4j.TwitterFactory
import twitter4j.ResponseList
import twitter4j.Location
/**
 *
 * @author Aishu
 */
class Executer{
	static void main(def args){
            println "Hello"
            def twitter=new TwitterFactory().getInstance();
            def id=twitter.getId();
            println "id: "+id;
            ResponseList<Location> responseList=twitter.getAvailableTrends();
            def result =responseList.each(){it->
                println it;
                
            }
            
        }
}

