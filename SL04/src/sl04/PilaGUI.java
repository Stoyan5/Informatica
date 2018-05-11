/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sl04;


import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author stoyan.botusharov
 */
public class PilaGUI extends Frame implements ActionListener, ItemListener {
	
	PilaNodo pila;
	NodoConc sentinel;
	
	//Componenti
	TextField hello;
	Button push;
	Label top;
	Button pop;
	Label isEmpty;
	//separatore grafico
	Button toTop;
	Label current;
	Button previous;
	
	public PilaGUI(String title, PilaNodo pila){
		super(title);
		this.pila=pila;
		
		hello=new TextField();
		push=new Button("Push");
		top=new Label();
		pop=new Button("Pop");
		isEmpty=new Label();
		//separatore grafico;
		toTop=new Button("<<");
		current=new Label();
		previous=new Button(">");
		
		addWindowListener(new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent e){
				dispose();
			}
		}
		);
		
		setSize(200,200);
		setLayout(new GridLayout(3,4));
		
		add(hello);
		add(push);
		add(top);
		add(pop);
		add(isEmpty);
		add(toTop);
		add(current);
		add(previous);
		hello.addActionListener(this);
		push.addActionListener(this);
		pop.addActionListener(this);
		toTop.addActionListener(this);
		previous.addActionListener(this);
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==push){
			if(pila.isEmpty())isEmpty.setText("");
			pila.push(hello.getText());
			sentinel=pila.node;
			top.setText(sentinel.info.toString());
		}else if(e.getSource()==pop){
			pila.pop();
			sentinel=pila.node;
			top.setText(sentinel.info.toString());
		}else if(e.getSource()==toTop){
			sentinel=(NodoConc) pila.top();
			top.setText(sentinel.info.toString());
		}else if(e.getSource()==previous){
			sentinel=sentinel.next;
			top.setText(sentinel.info.toString());
		}
		if(pila.isEmpty())isEmpty.setText("La pila è vuota");
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		System.out.println(e.getItem());
	}
	
}
