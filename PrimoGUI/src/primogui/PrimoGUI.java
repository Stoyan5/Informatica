package primogui;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.beans.EventHandler;

/**
 *
 * @author stoyan.botusharov
 */
public class PrimoGUI {
	public static void main(String[] args) {
		String[] array=new String[10];
		ListaConcatenata<String> lista = new ListaConcatenata();
		NodoConc<String> sentinel =lista.testa;
		
		//contenitori
		Frame frame = new Frame("TestGUI");
		frame.setLayout(new GridLayout(3,3));
		frame.setVisible(true);
		frame.setResizable(true);

		//Componenti
			//Button bottone = new Button("questo è un bottone");
		Button toStart = new Button("<<");
		Label getLength = new Label("Lung");//no
		Button toEnd = new Button(">>");
		Button previous = new Button("<");
		Label current = new Label("abc");//no
		Button next = new Button(">");
		Button add = new Button("ADD");
		TextField def = new TextField("def");
		Button delete = new Button("DEL");
		
		//Ascoltatori
			//AscoltaBottone ascBtn=new AscoltaBottone();
		AscoltaToStart ascStart = new AscoltaToStart();
		toStart.addMouseListener(ascStart);
		AscoltaGetLength ascLung = new AscoltaGetLength();
		getLength.addMouseListener(ascLung);
		AscoltaToEnd ascEnd = new AscoltaToEnd();
		toEnd.addMouseListener(ascEnd);
		AscoltaPrevious ascPrev = new AscoltaPrevious();
		previous.addMouseListener(ascPrev);
		AscoltaCurrent ascCurrent = new AscoltaCurrent();
		//current.addMouseListener(ascCurrent);
		AscoltaNext ascNext = new AscoltaNext();
		next.addMouseListener(ascNext);
		AscoltaAdd ascAdd = new AscoltaAdd();
		add.addMouseListener(ascAdd);
		AscoltaToStart ascDel = new AscoltaToStart();
		delete.addMouseListener(ascDel);
		
		//Lung label updaters
		
		AscoltaFinestra ascFin = new AscoltaFinestra();
		frame.add(toStart);
		frame.add(getLength);
		frame.add(toEnd);
		frame.add(previous);
		frame.add(current);
		frame.add(next);
		frame.add(add);
		frame.add(def);
		frame.add(delete);
		//adder del frame
		//frame.add();
	}
}
