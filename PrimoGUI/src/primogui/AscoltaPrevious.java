/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primogui;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author stoyan.botusharov
 */
public class AscoltaPrevious implements MouseListener {
	ListaConcatenata lista;
	NodoConc<String> sentinel;

	@Override
	public void mouseClicked(MouseEvent e) {
		if (this.sentinel == null) {
			this.sentinel = lista.testa;
			System.out.println("there is no previous element");
		} else {
			this.sentinel = this.sentinel.previous;
			System.out.println(this.sentinel.info);
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void mouseExited(MouseEvent e) {
		//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

}
