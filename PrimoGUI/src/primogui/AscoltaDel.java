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
public class AscoltaDel implements MouseListener{
	ListaConcatenata lista;
	NodoConc sentinel;
	
	@Override
	public void mouseClicked(MouseEvent e) {
		if (sentinel == null) {
			System.out.println("there is nothing to delete");
		} else {
			lista.remove(sentinel);
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
