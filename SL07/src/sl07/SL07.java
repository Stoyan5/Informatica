/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sl07;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import static sl07.importVocabulary.readLines;
//import static sl07.Finder;

/**
 *
 * @author stoyan.botusharov
 */
public class SL07 {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		File file=new File("inglese_italiano.txt");
		
		List<String> list=readLines(file);
		System.out.println("insert message");
		Finder finder=new Finder(scanner.nextLine(),list);
		finder.find();
	}
	
}
