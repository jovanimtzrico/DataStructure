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
public class HashMap {

    private int capacity = 10;
    private HashLinkedList[] arr = new HashLinkedList[capacity];

    public void put(String key, String value) {
        HashLinkedList.Node current = new HashLinkedList.Node(key, value);
        int temp = Math.abs(key.hashCode() % capacity);
        System.out.println(temp);
        if (arr[temp] == null) {
            arr[temp] = new HashLinkedList();
        }
        arr[temp].add(current);
    }

    public String get(String key) {
        int temp = Math.abs(key.hashCode() % capacity);
        if (arr[temp] == null) {
            return null;
        }
        return arr[temp].get(key);
    }

    public boolean delete(String key) {
        int indx = Math.abs(key.hashCode() % capacity);
        if (arr[indx] != null) {
            return arr[indx].delete(key);
        }
        return false;
    }

    public void displayTable() {
        for (int i = 0; i < arr.length; i++) {
            //System.out.print(i + ". ");
            if (arr[i] != null) {
                arr[i].displayList();
            }
        }
    }
}
