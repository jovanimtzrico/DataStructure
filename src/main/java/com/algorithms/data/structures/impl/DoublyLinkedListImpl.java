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
        if (isEmpty()) {
            firstLink = new Link<>(element, null, null);
            lastLink = firstLink;
        } else {
            firstLink.setPrevious(new Link<>(element, firstLink, null));
            firstLink = firstLink.getPrevious();
        }
    }

    @Override
    public void insertLast(E element) {
        if (isEmpty()) {
            firstLink = new Link<>(element, null, null);
            lastLink = firstLink;
        } else {
            lastLink.setNext(new Link<>(element, null, lastLink));
            lastLink = lastLink.getNext();
        }
    }

    @Override
    public boolean insertAt(E element, E after) {
        if (isEmpty()) {
            return false;
        } else {
            Link<E> current = firstLink;
            while (current != null) {
                if (current.getElement().equals(after)) {
                    if (current == lastLink) {
                        current.setNext(new Link<E>(element, null, current));
                        lastLink = current.getNext();
                    } else {
                        Link<E> temp = new Link<>(element, current.getNext(), current);
                        current.getNext().setPrevious(temp);
                        current.setNext(temp);
                    }
                    return true;
                } else {
                    current = current.getNext();
                }
            }
        }
        return false;
    }

    @Override
    public E deleteFirst() {
        if (!isEmpty()) {
            Link<E> current = firstLink;
            if (current.getNext() != null) {
                current.getNext().setPrevious(null);
                firstLink = current.getNext();
            } else {
                firstLink = null;
                lastLink = null;
            }
            return current.getElement();
        }
        return null;
    }

    @Override
    public E deleteLast() {
        if (!isEmpty()) {
            Link<E> current = lastLink;
            if (current.getPrevious() == null) {
                firstLink = null;
                lastLink = null;
            } else {
                current.getPrevious().setNext(null);
                lastLink = current.getPrevious();
            }
            return current.getElement();
        }
        return null;
    }

    @Override
    public boolean deleteElement(E element) {
        if (isEmpty()) {
            return false;
        } else {
            Link<E> current = firstLink;
            while (current != null) {
                if (current.getElement().equals(element)) {
                    if (current == lastLink && firstLink == current) {
                        firstLink = null;
                        lastLink = null;
                    } else if (current == lastLink) {
                        lastLink = current.getPrevious();
                        current.getPrevious().setNext(null);
                        current.setPrevious(null);
                    } else if (firstLink == current) {
                        firstLink = firstLink.getNext();
                        current.getNext().setPrevious(null);
                    } else {
                        current.getNext().setPrevious(current.getPrevious());
                        current.getPrevious().setNext(current.getNext());
                    }
                    return true;
                } else {
                    current = current.getNext();
                }
            }
        }
        return false;
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
        Link<E> current = lastLink;
        while (current != null) {
            System.out.println(current.getElement());
            current = current.getPrevious();
        }
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
        public Link(E element, Link next, Link previous) {
            this.element = element;
            this.next = next;
            this.previous = previous;
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
