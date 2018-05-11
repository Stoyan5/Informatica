package esercitazioneletturedafile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;
import java.util.ArrayList;
public class EsercitazioneLettureDaFile {
	public int lines;
	public String[] a;
	public static void main(String[] args) throws FileNotFoundException {
		File inFile = new File("Z:\\input.txt");
		EsercitazioneLettureDaFile lol = new EsercitazioneLettureDaFile(inFile);
		lol.export(lol.toString());
		lol.export(lol.printLine(3));
		lol.export(Integer.toString(lol.getLines()));
		lol.export(lol.invert());
	}
	public EsercitazioneLettureDaFile(File x) throws FileNotFoundException{
		ArrayList aL = new ArrayList();
		lines=0;
		File inFile = x;
		Scanner inScan = new Scanner(inFile);
		while(inScan.hasNextLine()){
			lines++;
			aL.add(inScan.nextLine());
		}
		a = (String[]) aL.toArray();
	}
	@Override
	public String toString(){
		String s="";
		for (String a1 : a) {
			s.concat(a1);
		}
		return s;
	}
	public String printLine(int n){
		return a[n];
	}
	public int getLines(){
		return lines;
	}
	public String invert(){
		String s="";
		for (int i = a.length; i >0; i--) {
			s.concat(a[i]);
		}
		return s;
	}
	public void export(String s) throws FileNotFoundException{
		PrintWriter outFile = new PrintWriter("Z:\\output.txt");
		outFile.println(s);
	}
}
