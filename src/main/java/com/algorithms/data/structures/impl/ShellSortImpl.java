/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algorithms.data.structures.impl;

import com.algorithms.data.structures.ShellSort;

/**
 *
 * @author Jovani
 */
public class ShellSortImpl implements ShellSort {

    private int[] theArray;
    private int nElems;
    

    public ShellSortImpl(int max) {
        theArray = new int[max];
        nElems = 0;
    }

    @Override
    public void sort() {
        int pivote, innerPosition, temp;
        int jump = nElems / 2;

        while (jump > 0) {
            for (int i = 0; i < nElems - jump; i++) {
                innerPosition = jump + i;
                temp = theArray[innerPosition];
                pivote = i;
                while (pivote >= 0 && temp <= theArray[pivote]) {
                    theArray[innerPosition] = theArray[pivote];
                    innerPosition = pivote;
                    pivote -= jump;
                }
                theArray[innerPosition] = temp;
            }
            jump /= 2;
        }
    }

    @Override
    public void display() {
        System.out.print("A=");
        for (int j = 0; j < nElems; j++) {
            System.out.print(theArray[j] + " ");
        }
        System.out.println("");
    }

    @Override
    public void insert(int value) {
        theArray[nElems] = value;
        nElems++;
    }
}
