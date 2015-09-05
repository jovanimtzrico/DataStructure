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
public class LinkedListiImpl<E> implements LinkedList<E> {

    Link<E> firstLink;

    @Override
    public void insertFirst(E element) {
        if (firstLink == null) {
            firstLink = new Link<>(element, null);
        } else {
            firstLink = new Link<>(element, firstLink);
        }
    }

    @Override
    public boolean insertAt(E element, E after) {
        Link<E> previus = firstLink;
        Link<E> current = firstLink;
        while (current != null) {
            if (current.getElement().equals(after)) {
                previus = current;
                current = new Link<>(element, current.getNext());
                previus.setNext(current);
                return true;
            } else {
                previus = current;
                current = current.getNext();
            }
        }
        if(isEmpty()){
            firstLink = new Link<>(element,null);
            return true;
        }
        return false;
    }

    @Override
    public void insertLast(E element) {
        Link<E> previus = firstLink;
        Link<E> current = firstLink;

        if (isEmpty()) {
            firstLink = new Link<>(element, null);
            return;
        }
        while (current != null) {
            previus = current;
            current = current.getNext();
        }
        previus.setNext(new Link<>(element, current));
    }

    @Override
    public E removeFirst() {
        if (!isEmpty()) {
            Link<E> current = firstLink;
            firstLink = firstLink.getNext();
            return current.getElement();
        }
        return null;
    }

    @Override
    public E removeLast() {
        Link<E> previus = firstLink;
        Link<E> current = firstLink;
        if (isEmpty()) {
            return null;
        }
        while (current.getNext() != null) {
            previus = current;
            current = current.getNext();
        }
        previus.setNext(null);
        return current.getElement();
    }

    @Override
    public boolean removeElement(E element) {
        Link<E> previus = firstLink;
        Link<E> current = firstLink;
        while (current != null) {
            if (current.getElement().equals(element)) {
                previus.setNext(current.getNext());
                return true;
            } else {
                previus = current;
                current = current.getNext();
            }
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        return firstLink == null;
    }

    @Override
    public void display() {
        Link current = firstLink;
        while (current != null) {
            System.out.println(current.getElement());
            current = current.getNext();
        }
    }

    private class Link<E> {

        private E element;
        private Link next;

        public Link(E data, Link next) {
            this.element = data;
            this.next = next;
        }

        /**
         * @return the data
         */
        public E getElement() {
            return element;
        }

        /**
         * @param data the data to set
         */
        public void setElement(E data) {
            this.element = data;
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

    }
}
