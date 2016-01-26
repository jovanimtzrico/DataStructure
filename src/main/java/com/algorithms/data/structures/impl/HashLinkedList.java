/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algorithms.data.structures.impl;

/**
 *
 * @author Jovani
 */
public class HashLinkedList {

    private Node first;

    public void add(Node element) {
        if (first == null) {
            first = element;
        } else {
            Node current = first;
            Node previus = first;
            while (current.getNext() != null) {
                previus = current;
                current = current.getNext();
            }
            previus.setNext(element);
        }
    }

    public String get(String key) {
        if (first == null) {
            return null;
        } else {
            Node current = first;
            while (current != null) {
                if (current.getKey() == key) {
                    return current.getData();
                } else {
                    current = current.next;
                }
            }
        }
        return null;
    }

    public boolean delete(String key) {
        Node previus = first;
        Node current = first;
        while (current != null) {
            if (current.getKey().equals(key)) {
                if(first.getNext() == null){
                    first = null;
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

    public void displayList() {
        Node current = first;
        System.out.print("List (first-->last): ");
        while (current != null) {
            System.out.print(current.getData() + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static class Node {

        private Node next;
        private String key;
        private String data;

        public Node(String key, String data) {
            this.data = data;
            this.key = key;
        }

        private Node getNext() {
            return next;
        }

        private void setNext(Node next) {
            this.next = next;
        }

        private String getKey() {
            return key;
        }

        private String getData() {
            return data;
        }
    }
}
