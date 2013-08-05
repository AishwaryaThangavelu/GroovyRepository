package aish.vaishno.groovyworkout2.executer;

import java.awt.GraphicsConfiguration.DefaultBufferCapabilities;
import java.beans.StaticFieldsPersistenceDelegate;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;

public class Duck {

	def someString=['Hi','Aish'];
	
	def quack() {
		
		println "Quack $someString";
	}
	
	
	static void main(def args) {
		def duck= new Duck();
		Closure closure=duck.quack();
		duck.someString.each closure;
	
	}
}
