/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algorithms.data.structures;

/**
 *
 * @author Jovani
 */
public interface LinkedList<T> {
    public void insertFirst(T element);
    public T deleteFirst();
    public void display();
    public boolean isEmpty();
}
