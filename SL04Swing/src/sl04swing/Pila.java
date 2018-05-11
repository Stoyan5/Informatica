/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sl04swing;

/**
 *
 * @author sraem
 */
public class Pila implements IPila{
    private Object[]dati;
    private int testa=0;
	
	public Pila(){
		dati=new Object[10];testa=0;
	}
	
    public Pila(int n){
        dati=new Object [n];testa=0;
    }

    @Override
    public boolean isEmpty() {
        return testa==0;
    }

    @Override
    public void push(Object d) {
        dati[testa]=d;testa++;
    }

    @Override
    public Object pop() {
        Object r=top();testa--;return r;
    }

    @Override
    public Object top() {
        return dati[testa-1];
    }
    
    public boolean isFull(){
        return testa>dati.length;
    }
}
