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
public interface DoubleEndedList <E>{

    void insertFirst(E data);
    void insertLast(E data);
    boolean insertAt(E data, E after);
    E deletefisrt();
    E deleteLast();
    E deleteAt(E data);
    void displayList();
    boolean isEmpty();
}
