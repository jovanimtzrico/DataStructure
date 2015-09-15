/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algorithms.data.structures.impl;

import com.algorithms.data.structures.SortedList;

/**
 *
 * @author Jovani
 */
public class SortedListImpl<E> implements SortedList<E> {

    private Link<E> firstLink;

    @Override
    public void insert(E element) {
        if (isEmpty()) {
            firstLink = new Link.Builder<>(element).build();
        } else {
            Link<E> previus = null;
            Link<E> current = firstLink;
            while (current != null) {
                if (compare(current.getElement(), element) >= 0) {
                    if (previus == null) {
                        firstLink = new Link.Builder<>(element).setNext(firstLink).build();
                    } else {
                        current = new Link.Builder<>(element).setNext(current).build();
                        previus.setNext(current);
                    }
                    return;
                }
                previus = current;
                current = current.getNext();
            }
        }
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

    private int compare(E o1, E o2) {
        Comparable id1 = (Comparable) (o1);
        Comparable id2 = (Comparable) (o2);
        return id1.compareTo(id2);
    }

    private static final class Link<E> {

        private E element;
        private Link<E> next;

        private Link(Builder builder) {
            this.element = (E) builder.element;
            this.next = builder.next;
        }

        /**
         * @return the data
         */
        private E getElement() {
            return element;
        }

        /**
         * @return the next
         */
        private Link getNext() {
            return next;
        }

        /**
         * @param next the next to set
         */
        private void setNext(Link next) {
            this.next = next;
        }

        private static class Builder<E> {

            private final E element;
            private Link<E> next;

            private Builder(E element) {
                this.element = element;
            }

            private Builder setNext(Link<E> next) {
                this.next = next;
                return this;
            }

            private Link build() {
                return new Link(this);
            }
        }
    }
}
