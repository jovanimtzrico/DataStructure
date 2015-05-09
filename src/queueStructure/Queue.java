/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queueStructure;

/**
 *
 * @author Jovani
 */
public interface Queue <T>{
    void insert();
    T revome();
    T peekFront();
    boolean isEmpty();
    boolean isFull();
    int size();
}
