package aish.vaishno.groovyworkout1.xml

class XmlBuildParse {

	def buildXml(){
		def mySqlConnection=groovy.sql.Sql.newInstance('jdbc:mysql://localhost:3306/aish_projects','aish','vaishno','com.mysql.jdbc.Driver');
		def xmlBuilder= new groovy.xml.MarkupBuilder();
		xmlBuilder.GreWordList{
			mySqlConnection.eachRow("select * from gre_wordList") {table ->
				OneRow(ID: table.gre_id, word: table.gre_word, meaning: table.gre_word_meaning)
			}
		}
		mySqlConnection.close();
	}
	
	def parseXml(){
		def parsedOutput=new XmlSlurper().parse(new File("C:\\Users\\Aishu\\Workspaces\\StudyWorkspace\\GroovyPersistence\\src\\aish\\vaishno\\groovypersistence\\xml\\MyThings.xml"));
		println "ID\t Item\t Company"
		parsedOutput.Item.each {
		println "${it.@id}\t ${it.name[0]}\t ${it.company[0]}"
		}
	}
	
	static void main(def args){
		//println new File("C:\\Users\\Aishu\\Workspaces\\StudyWorkspace\\GroovyPersistence\\src\\aish\\vaishno\\groovypersistence\\xml\\MyThings.xml").getText();
		//println new File("C:\\Users\\Aishu\\Workspaces\\StudyWorkspace\\GroovyPersistence\\src\\aish\\vaishno\\groovypersistence\\xml\\MyThings.xml").getAbsoluteFile();
		
		
		XmlBuildParse xmlBuilParse=new XmlBuildParse();
		xmlBuilParse.buildXml();
		xmlBuilParse.parseXml()
	}
}
