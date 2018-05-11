/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sl04;

/**
 *
 * @author stoyan.botusharov
 */
public interface IPila {
    boolean isEmpty();
    void push(Object d);
    Object pop();
    Object top();
}
