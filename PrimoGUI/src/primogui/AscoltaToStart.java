package primogui;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author stoyan.botusharov
 */
class AscoltaToStart implements MouseListener{
	ListaConcatenata<String> lista;
	NodoConc sentinel;
	
	@Override
	public void mouseClicked(MouseEvent e) {
		this.sentinel =this.lista.testa;
		System.out.println(this.lista.testa);
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
