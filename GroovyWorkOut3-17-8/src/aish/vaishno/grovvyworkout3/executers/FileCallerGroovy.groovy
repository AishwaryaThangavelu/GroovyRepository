package aish.vaishno.grovvyworkout3.executers


class FileCallerGroovy {

	static getContent(){
		def file=new File("Names.txt");
		if(file.exists()){
			println file.text;
		}
		
	}
	
	static append() {
		def file= new File(("Names.txt"));
		if(file.exists()) {
		file<<"###"
		}
	}
	
	def name() {
		"Aish T"
	}
}

