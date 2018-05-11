/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primogui;

import java.util.ArrayList;
import primogui.NodoConc;

/**
 *
 * @author stoyan.botusharov
 * @param <T>
 */
public class ListaConcatenata<T> {
	int lung;
	NodoConc<T> testa;
	NodoConc<T> coda;
	T[] aL;
	public ListaConcatenata(){
		this.lung=0;
		this.testa=null;
		this.coda=null;
	}
	public ListaConcatenata(T[] aL){
		this.lung=aL.length;
		testa=new NodoConc(null,null);
		coda=testa;
		
		for (int i = 0; i < lung; i++) {
			NodoConc create=new NodoConc(aL[i+1],null,coda);
			coda.next=create;
			coda=coda.next;
		}
	}
	@Override
	public String toString(){
		String ris=null;
		NodoConc temp=testa;
		while(!temp.equals(coda)){
			ris.concat(temp.info.toString()+" ");
			temp=temp.next;
		}
		ris.concat(coda.info.toString());
		return ris;
	}
	public int size(){
		return lung;
	}
	public void addHead(T elem){
		NodoConc<T> bb=new NodoConc(elem);
		if(testa!=null){
			bb.next=testa;
		}else coda=bb;
		testa=bb;
		lung++;
	}
	public void addTail(T elem){
		NodoConc<T> bb=new NodoConc(elem,null);
		if(coda!=null)coda.next=bb;
		else testa=bb;
		coda=bb;
		lung++;
	}
	public void removeHead(){
		testa=testa.next;
		lung--;
	}
	public void removeTail(){
		NodoConc temp=testa;
		for (int i = 0; i < lung-2; i++) {
			temp=temp.next;
		}
		coda=temp;
		lung--;
	}
	public T get(int n){
		NodoConc temp=testa;
		for (int i = 0; i < n-1; i++) {
			temp=temp.next;
		}
		return (T) temp.info;
	}
	public void set(int n,T x){
		NodoConc temp=testa;
		for (int i = 0; i < n-1; i++) {
			temp=temp.next;
		}
		temp.info=x;
	}
	public void add(int n,T x){
		NodoConc temp=testa;
		NodoConc xNode= new NodoConc(x,null);
		for (int i = 0; i < n-1; i++) {
			temp=temp.next;
		}
		NodoConc temp2=temp.next;
		temp.next=xNode;
		xNode.next=temp2;
	}
	public void remove(int n){
		NodoConc temp=testa;
		for (int i = 0; i < n-1; i++) {
			temp=temp.next;
		}
		NodoConc temp2 =temp.next.next;
		temp.next=temp2;
	}
	public void remove(NodoConc toRemove){
		NodoConc sentinel=testa;
		while(sentinel!=toRemove&&sentinel.next!=null)sentinel=sentinel.next;
		NodoConc temp=sentinel.previous;
		temp.next=sentinel.next;
		sentinel=null;
	}
	public static ListaConcatenata ArrayListToList(ArrayList aL){
		ListaConcatenata lCT=new ListaConcatenata();
		for (int i = 0; i < aL.size()-1; i++) {
			lCT.addTail(aL.get(i));
		}
		return lCT;
	}
}
