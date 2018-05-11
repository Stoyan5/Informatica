/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sl07;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author stoyan.botusharov
 */
public class importVocabulary {
	//File file = new File("inglese_italiano.txt");
	//List allLines;
	/*public static void main(String[] args) throws IOException{
		File file = new File("inglese_italiano.txt");
		List<String> allLines =new ArrayList<>();
		allLines=readLines(file);
	}*/

	public static List readLines(File file) throws IOException {
		long timeStart=System.currentTimeMillis();
		if (!file.exists()) {
			System.out.println("File not found");
			return null;
		}
		BufferedReader reader = new BufferedReader(new FileReader(file));
		List<String> results = new ArrayList<String>();
		String line = reader.readLine();
		while (line != null) {
			results.add(line);
			line = reader.readLine();
		}
		System.out.println("file read successfully");
		System.out.println((System.currentTimeMillis()-timeStart)/1000);
		return results;
	}
}