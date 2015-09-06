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
public interface DoublyLinkedList<E> {
    void insertFirst(E element);
    void insertLast(E element);
    boolean insertAt(E element, E after);
    E deleteFirst();
    E deleteLast();
    boolean deleteElement(E element);
    boolean isEmpty();
    void displayForward();
    void displayBackward();
}
