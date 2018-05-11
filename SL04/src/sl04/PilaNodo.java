/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sl04;

/**
 *
 * @author sraem
 */
public class PilaNodo extends Pila{
    public NodoConc node;
    public PilaNodo() {
        NodoConc node=new NodoConc(null,null);
    }
    
    @Override
    public void push(Object d){
        //crea un nuovo oggetto, lo collega ad a e lo collega al nuovo riferimento
        NodoConc a=new NodoConc(d,null);
        node.next=a;
		
    }
	@Override
    public Object pop(){
		Object temp=node;
        node=node.next;
        return temp;
    }
	public Object top(){
		return node;
	}
}
