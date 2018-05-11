/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primogui;

/**
 *
 * @author stoyan.botusharov
 * @param <T>
 */
public class NodoConc<T> {
	T info;
	NodoConc<T> next;
	NodoConc<T> previous;
	public NodoConc(T info, NodoConc<T>next){
		this.info=info;
		this.next=next;
		this.previous=null;
	}
	public NodoConc(T info){
		this.info=info;
		this.next=null;
		this.previous=null;
	}

	public NodoConc(T info, NodoConc<T> next, NodoConc<T> previous) {
		this.info = info;
		this.next = next;
		this.previous = previous;
	}
}
