/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algorithms.data.structures.impl;

import com.algorithms.data.structures.DoublyLinkedList;

/**
 *
 * @author Jovani
 */
public class DoublyLinkedListImpl<E> implements DoublyLinkedList<E> {

    private Link<E> firstLink;
    private Link<E> lastLink;

    @Override
    public void insertFirst(E element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insertLast(E element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insertAt(E element, E after) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public E deleteFirst() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public E deleteLast() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteElement(E element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isEmpty() {
        return firstLink == null;
    }

    @Override
    public void displayForward() {
        Link<E> current = firstLink;
        while (current != null) {
            System.out.println(current.getElement());
            current = current.getNext();
        }

    }

    @Override
    public void displayBackward() {

    }

    private class Link<E> {

        /**
         * element is the data item next is the next link in list
         */
        private E element;
        private Link next;
        private Link previous;

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
         * @param element the element to set
         */
        public void setElement(E element) {
            this.element = element;
        }

        /**
         * @return the next
         */
        public Link getNext() {
            return next;
        }

        /**
         * @param next the next to set
         */
        public void setNext(Link next) {
            this.next = next;
        }

        /**
         * @return the previous
         */
        public Link getPrevious() {
            return previous;
        }

        /**
         * @param previous the previous to set
         */
        public void setPrevious(Link previous) {
            this.previous = previous;
        }
    }
}
