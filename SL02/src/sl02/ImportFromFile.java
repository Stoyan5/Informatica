
package sl02;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author stoyan.botusharov
 */
public class ImportFromFile extends ListaConcatenata{
	File inFile = new File("stdin.txt");
	
	public ListaConcatenata ListaConcatenata(File inFile) throws FileNotFoundException{
		ArrayList aL = new ArrayList();
		this.lung=0;
		Scanner inScan = new Scanner(inFile);
		inScan.hasNextLine();
		aL.add(inScan.nextLine());
		this.lung++;
		this.testa=null;
		this.coda=null;
		return ArrayListToList(aL);
	}
}
