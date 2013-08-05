package aish.vaishno.groovyworkout2.executer

import java.awt.GraphicsConfiguration.DefaultBufferCapabilities;

import org.apache.ivy.util.ChecksumHelper;

class Executer {

	
	
	static void main(def args) {
		POJO pojo=new POJO();
		pojo.setFirstName("AIshwarya");
		def a= {value->
			def b= {valueb->
				println '1: '+ (value+valueb);
				value+valueb;
			}
			
			def innerClosure= b.call(3);
			println '2: '+'HelloWorld: '+value;
			println innerClosure;
		}
				
	/*	Executer executer=new Executer();
		a.call(1);*/
		
		
		/*a.call(null);
		a?.call();*/
		
		
		def list= [1,3,2,3,2,2,2];
		
		def retrieve=list.findAll(){value->
			value==2;
		}
		
		def mapping=['a':1,'b':2,'c':2,'d':9];
		
		def retrieveMap=mapping.find(){key,value->
			key=='d';
		}
		
		def reversedMap=mapping.reverseEach {key,value->
			println key+": "+value;
		}
		println retrieve;
		println  retrieveMap;
		reversedMap;
		/*retrieve.each {
			println it;
		}*/
		
		
		
		
	}
	
	
	
}
