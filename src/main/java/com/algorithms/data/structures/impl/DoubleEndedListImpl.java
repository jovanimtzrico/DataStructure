/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algorithms.data.structures.impl;

import com.algorithms.data.structures.DoubleEndedList;

/**
 *
 * @author Jovani
 */
public class DoubleEndedListImpl<E> implements DoubleEndedList<E>{
    Link<E> firstLink;
    Link<E> lastLink;

    @Override
    public void insertFirst(E element) {
        if (firstLink == null) {
            firstLink = new Link<>(element, null);
            lastLink = firstLink;
        } else {
            firstLink = new Link<>(element, firstLink);
        }
    }

    @Override
    public void insertLast(E element) {
        if (isEmpty()) {
            firstLink = new Link<>(element, null);
            lastLink = firstLink;
            return;
        }
        lastLink.setNext(new Link<>(element, null));
        lastLink = lastLink.getNext();

    }

    @Override
    public E removeFirst() {
        if (!isEmpty()) {
            Link<E> current = firstLink;
            if (firstLink == lastLink) {
                firstLink = null;
                lastLink = null;
            } else {
                firstLink = firstLink.getNext();
            }
            return current.getElement();
        }
        return null;
    }

    @Override
    public E removeLast() {

        Link<E> current = firstLink;
        if (isEmpty()) {
            return null;
        }
        while (current.getNext() != lastLink) {
            current = current.getNext();
        }
        Link<E> removeElement = lastLink;
        lastLink = current;
        current.setNext(null);
        return removeElement.getElement();
    }

    @Override
    public boolean removeElement(E element) {
        Link<E> previus = firstLink;
        Link<E> current = firstLink;
        while (current != null) {
            if (current.getElement().equals(element)) {
                if (current == lastLink) {
                    lastLink = previus;
                }
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
        System.out.println("Last " + lastLink.getElement());
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
