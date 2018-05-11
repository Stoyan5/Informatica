/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Stoyan.botusharov
 */

import sl02.ListaConcatenata;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import static sl02.ListaConcatenata.ArrayListToList;

public class ReadWords {
	public static ListaConcatenata<String> linee(String nomeFile)
		throws FileNotFoundException{
		return linee(nomeFile,"UTF-8");
	}
			
/*	public static ListaConcatenata<String> linesFromTo(int from, int to, String fileName)
        throws FileNotFoundException, IllegalArgumentException {
    return linesFromTo(from, to, fileName, "UTF-8");
}*/
	public static ListaConcatenata<String> linee(String nomeFile, String charsetName)
			throws FileNotFoundException{
		ArrayList<String> lines=new ArrayList<String>();
		Scanner scan = new Scanner(new File(nomeFile),charsetName);

		while(scan.hasNextLine()){
			String line = scan.nextLine();
			lines.add(line);
		}
		return ArrayListToList(lines);
	}
	
}
/*public static List<String> linesFromTo(int from, int to, String fileName, String charsetName)
        throws FileNotFoundException, IllegalArgumentException {

    if(from > to) {
        throw new IllegalArgumentException("'from' > 'to'");
    }
    if(from < 1 || to < 1) {
        throw new IllegalArgumentException("'from' or 'to' is negative");
    }

    List<String> lines = new ArrayList<String>();
    Scanner scan = new Scanner(new File(fileName), charsetName);
    int lineNumber = 0;

    while(scan.hasNextLine() && lineNumber < to) {
        lineNumber++;
        String line = scan.nextLine();
        if(lineNumber < from) continue;
        lines.add(line);
    }

    if(lineNumber != to) {
        throw new IllegalArgumentException(fileName+" does not have "+to+" lines");
    }

    return lines;
}
}
*/