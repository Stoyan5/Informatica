/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sl04;

/**
 *
 * @author stoyan.botusharov
 */
public class DemoSL04 {
	public static void main(String[] args) {
		
		PilaNodo modello = new PilaNodo() {};
		PilaGUI f = new PilaGUI("Prova MVC Pila",modello);
		f.setVisible(true);
		
	}
}
