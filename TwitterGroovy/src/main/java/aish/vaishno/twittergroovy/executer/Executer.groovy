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

def twitter=new TwitterFactory().getInstance();

assert twitter.getId()
assert twitter.getAvailableTrends()

twitter.getAvailableTrends().each(){it->
    println it;
}
            
