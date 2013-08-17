package aish.vaishno.grovvyworkout3.executers


class FileCallerGroovy {

	static getContent(){
		def output=[];
		try {
			def fileReader=new FileReader("dfgdgfNames.txt");
			fileReader.readLines().each {
				output+=it;
			}	
		}catch(FileNotFoundException ex) {
			println 'File not found'
		}	
		return output;
	}
	
	static append() {
		def bw=new BufferedWriter(new FileWriter(new File("Names.txt"),true));
		bw.write("###");
		bw.close();
	}
	
	def name() {
		"Aish T"
	}
}

