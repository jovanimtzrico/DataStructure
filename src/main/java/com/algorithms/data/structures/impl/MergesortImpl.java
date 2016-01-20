/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algorithms.data.structures.impl;

import com.algorithms.data.structures.Mergesort;

/**
 *
 * @author Jovani
 */
public class MergesortImpl implements Mergesort {

    int[] theArray;
    private int nElems;

    public MergesortImpl(int nElems) {
        this.theArray = new int[nElems];
        this.nElems = 0;
    }

    @Override
    public void display() {
        for (int i = 0; i < theArray.length; i++) {
            System.out.print(theArray[i] + " ");
        }
        System.out.println("");
    }

    @Override
    public void merge() {
        int[] workspace = new int[theArray.length];
        splitArray(workspace, 0, theArray.length - 1);
    }

    public void splitArray(int[] workspace, int lowerBound, int upperBound) {
        if (lowerBound == upperBound) {
            return;
        }
        int half = (lowerBound + upperBound) / 2;
        splitArray(workspace, lowerBound, half);
        splitArray(workspace, half + 1, upperBound);
        domerge(workspace, lowerBound, half + 1, upperBound);

    }

    public void domerge(int[] workspace, int lower, int half, int upper) {
        int indexLower = lower, indexMid = half - 1, numberElem = upper - lower + 1, indexArray = 0;

        while (indexLower <= indexMid && half <= upper) {
            if (theArray[indexLower] < theArray[half]) {
                workspace[indexArray++] = theArray[indexLower++];
            } else {
                workspace[indexArray++] = theArray[half++];
            }
        }
        while (indexLower <= indexMid) {
            workspace[indexArray++] = theArray[indexLower++];
        }
        while (half <= upper) {
            workspace[indexArray++] = theArray[half++];
        }
        System.out.println("workspace");
        for (int i = 0; i < numberElem; i++) {
            theArray[lower + i] = workspace[i];
            System.out.print(" "+workspace[i]+" ");
        }
        System.out.println("");
    }

    @Override
    public void insert(int element) {
        theArray[nElems++] = element;
    }
}
