package aish.vaishno.grovvyworkout3.executers;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileCaller {

	public static List getFileContent() {
		List output = new ArrayList();
		try {
			FileReader fileReader=new FileReader("Names.txt");
			BufferedReader bufferedReader=new BufferedReader(fileReader);
			
			for(int i=0;i<4;i++) {
				output.add(bufferedReader.readLine());
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return output;
	}
	
	public static void appendString() {
		try {
			FileWriter fileWriter=new FileWriter(new File("Names.txt"),true);
			BufferedWriter bw=new BufferedWriter(fileWriter);
			
			
			bw.write("^^^^");
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		FileCaller.appendString();
		List result=FileCaller.getFileContent();
		for (Object object : result) {
			System.out.println(object);
		}
		
		
	}
	
	
	
}
