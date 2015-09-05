/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algorithms.data.structures.impl;

import com.algorithms.data.structures.LinkedList;

/**
 *
 * @author Jovani
 */
public class LinkedListiImpl<T> implements LinkedList<T> {

    /**
     * first is the first element on the List
     */
    private Link<T> first;

    /**
     * Class constructor.
     */
    public LinkedListiImpl() {
        this.first = null;
    }

    @Override
    public void insertFirst(T element) {
        if (isEmpty()) {
            first = new Link<>(element, null);
        } else {
            Link<T> tempElement = new Link<>(element, first);
            first = tempElement;
        }
    }

    @Override
    public T deleteFirst() {
        return null;
    }

    @Override
    public void display() {

    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }

    /**
     * Class. define the element of the list
     */
    private static class Link<E> {

        /**
         * element is the data item next is the next link in list
         */
        private E element;
        private Link next;

        /**
         * Class constructor.
         */
        private Link(E element, Link next) {
            this.element = element;
            this.next = next;
        }

        /**
         * @return the element
         */
        public E getElement() {
            return element;
        }

        /**
         * @return the next
         */
        public Link getNext() {
            return next;
        }

    }
}
