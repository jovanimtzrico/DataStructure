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
    
    Link first = null;
    Link last = null;

    
    @Override
    public void insertFirst(E data) {
        if(first == null){
            
        }
    }

    @Override
    public void insertLast(E data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean insertAt(E data, E after) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public E deletefisrt() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public E deleteLast() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public E deleteAt(E data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void displayList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }

    
    private class Link {
        private Link next = null;
        private E data = null;
        
        Link(E elem){
            data = elem;
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
         * @return the data
         */
        public E getData() {
            return data;
        }

        /**
         * @param data the data to set
         */
        public void setData(E data) {
            this.data = data;
        }
        
    }
    
}
