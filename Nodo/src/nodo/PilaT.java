/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nodo;

/**
 *
 * @author sraem
 */
public abstract class PilaT <T> implements IPila{
    private T[] dati;
    private int testa=0;
    public PilaT(int n){
        dati.length=n;
		testa=0;
    }

    @Override
    public boolean isEmpty() {
        return testa==0;
    }

    @Override
    public void push(T d) {
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
