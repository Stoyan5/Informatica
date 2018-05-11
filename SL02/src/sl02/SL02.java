/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sl02;

/**
 *
 * @author stoyan.botusharov
 */
public class SL02 {

	public static void main(String[] args) {
		String[] lol = new String[4];
		lol[0]="aa";
		lol[1]="bb";
		lol[2]="cc";
		lol[3]="dd";
		ListaConcatenata<String>  Lp= new ListaConcatenata(lol);
		System.out.println(Lp.toString());
		Lp.addHead("xx");
		System.out.println(Lp.toString());
		Lp.addTail("ee");
		System.out.println(Lp.toString());
	}
}
