/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluationswing;

/**
 *
 * @author federico.rosato
 */
public class NodoConc<T> {
        
        public T info;
        public NodoConc<T> next;
        
        public NodoConc(T info, NodoConc<T> next){
            this.info = info;
            this.next = next;
        }

}
