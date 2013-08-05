package aish.vaishno.groovyworkout2.executer

import groovy.jmx.builder.JmxBuilderModelMBean.NumberSequencer;

import java.awt.GraphicsConfiguration.DefaultBufferCapabilities;
import java.awt.event.ItemEvent;
import java.security.cert.X509Certificate;

class Executer2 {

	def f(x){
		x*x;
	}
	
	Closure f2={ x ->
		x*x;
	}
	
	def numbers= (1..10).toList();
	
	
	
	
	static void main(def args) {
		Executer2 executer2=new Executer2();
		println 'Using def f(x): '+executer2.f(2);
		println 'Using CLosure: '+executer2.f2(2);
		println executer2.f(executer2.f2(2));
		
		/*
		executer2.numbers.sort {it->
			println it;
		}*/
		
		
		
		
		
	}
	
}
