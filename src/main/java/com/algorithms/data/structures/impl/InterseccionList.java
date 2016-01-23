/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algorithms.data.structures.impl;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author Jovani
 */
public class InterseccionList<E> implements Iterator<E> {

    Iterator<E> iterator1;
    Set<E> setArray;
    E element;

    public InterseccionList(Iterator<E> it1, Iterator<E> it2) {
        iterator1 = it1;
        setArray = new HashSet<E>();
        while (it2.hasNext()) {
            setArray.add((E) it2.next());
        }
    }

    @Override
    public boolean hasNext() {
        if (iterator1.hasNext() && element == null) {
            E temp = iterator1.next();
            if (setArray.contains(temp)) {
                element = temp;
                return true;
            }
            hasNext();
        }
        return false;
    }

    @Override
    public E next() {
        E temp = element;
        element = null;
        return temp;
    }

    @Override
    public void remove() {
    }
}
