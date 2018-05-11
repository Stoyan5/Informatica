/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sl02;

import java.util.Scanner;

/**
 *
 * @author stoyan.botusharov
 */
public class Prova {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int lunghezza = input.nextInt();
		String[] lol = new String[lunghezza];
		for (int i = 0; i < lol.length; i++) {
			lol[i]=input.nextLine();
		}
		ListaConcatenata lC = new ListaConcatenata(lol);
		lC.toString();
		lC.add(lunghezza/2, "lol");
		lC.toString();
		lC.addHead("primo elemento");
		lC.toString();
		lC.addTail("ultimo elemento");
		lC.toString();
		lC.get(lunghezza/3);
		lC.remove(lunghezza/2);
		lC.toString();
		lC.removeHead();
		lC.toString();
		lC.removeTail();
		lC.size();
		lC.set(lunghezza/2, "test");
	}
}
