
import sl02.ListaConcatenata;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import static sl02.ListaConcatenata.ArrayListToList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Stoyan.botusharov
 */
public class DictionarySearch{
	public static ListaConcatenata<String> linee(String nomeFile)
		throws FileNotFoundException{
		return linee(nomeFile,"UTF-8");
	}
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
	public static void main(String[] args) throws FileNotFoundException {
		ListaConcatenata lC =linee("words.txt");
		AlberoBinarioDiRicerca<String> alberoLinee= new AlberoBinarioDiRicerca<>(lC);
		System.out.println(alberoLinee.toString());
	}
}
