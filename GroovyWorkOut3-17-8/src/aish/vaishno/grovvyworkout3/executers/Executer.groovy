package aish.vaishno.grovvyworkout3.executers

FileCallerGroovy.append();


FileCallerGroovy.getContent().each {
	println it;
}
	
FileCallerGroovy fileCallerGroovy=new FileCallerGroovy();
println '\n\nchecking out without Return: '+fileCallerGroovy.name();