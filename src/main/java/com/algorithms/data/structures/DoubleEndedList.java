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
public interface DoubleEndedList<E> {

    void insertFirst(E element);

    void insertLast(E element);

    E removeFirst();

    E removeLast();

    boolean removeElement(E element);

    boolean isEmpty();

    void display();
}
