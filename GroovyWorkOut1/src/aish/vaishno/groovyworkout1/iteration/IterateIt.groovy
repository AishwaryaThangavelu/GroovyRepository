package aish.vaishno.groovyworkout1.iteration

import javax.swing.text.StyledEditorKit.ForegroundAction;

import aish.vaishno.groovyworkout1.persistence.GreWordListDetails

class IterateIt {

	def iterateArrayList(){
		def list=["Sunday","Monday","Wednesday"];
		
		println "\n **** Using Each *****"
		list.each {
			println it;
		}
		
		println "\n ****** Using Permutation ******"
		list.eachPermutation {
			println it;
		}
		
		println "\n **** Index *******"
		list.eachWithIndex {day,index->
			println index + " "+ day;
		}
	}
	
	def mapIterate(){
		
		//Iterate Map
		def mapIterate = new HashMap<String,String>();
		mapIterate.put("1","pen");
		mapIterate.put("2","pencil");
		mapIterate.put("3","Book");
		mapIterate.put("7","Glass");
		
		mapIterate.each {entry->
			println entry.key + " "+ entry.value;
		}
		
		//Iterate Map-List
		
		def list1=["sunday","monday"];
		def list2=["tuesday","wednesday"];
		
		def iterateMapList=['1':list1,'2':list2];
				
		iterateMapList.each {element->
			println element.key;
			println element.value;
			
		}
		
		// Iterate Map-Pojo
		
		GreWordListDetails greWordList1=new GreWordListDetails();
		greWordList1.greId=100;
		greWordList1.greWord="enigma";
		greWordList1.wordMeaning="mystery";
		
		
		
		GreWordListDetails greWordList2=new GreWordListDetails();
		greWordList2.greId=101;
		greWordList2.greWord="impetuous";
		greWordList2.wordMeaning="arrogant";
		
		 
		def mapPojoIteration=['Word 1':greWordList1,'Word 2':greWordList2];
		
		mapPojoIteration.each{element->
			
			println element.key ;
			println element.value.greId+" "+element.value.greWord+" "+element.value.wordMeaning;	
		}	
}
	
	
	static void main(def args){
		IterateIt iterateIt=new IterateIt();
		//iterateIt.iterateArrayList();
		iterateIt.mapIterate();
		}
}
