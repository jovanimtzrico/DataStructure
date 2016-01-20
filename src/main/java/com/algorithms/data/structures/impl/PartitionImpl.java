/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algorithms.data.structures.impl;

import com.algorithms.data.structures.Partition;

/**
 *
 * @author Jovani
 */
public class PartitionImpl implements Partition {

    private int[] array;
    private int nElems;

    public PartitionImpl(int maxElements) {
        this.array = new int[maxElements];
        this.nElems = 0;
    }

    @Override
    public void insert(int value) {
        array[nElems] = value;
        nElems++;
    }

    @Override
    public int partitionIt(int left, int right, double pivot) {
        int leftPtr = left;
        int rightPtr = right;
        for(int i=0; i<array.length; i++){
            if(array[leftPtr] > pivot && array[rightPtr] < pivot){
                swap(leftPtr, rightPtr);
                leftPtr++;
                rightPtr--;
            }else if(array[leftPtr] < pivot){
                leftPtr++;
            }else{
                rightPtr--;
            }
            if(leftPtr >= rightPtr){
                return leftPtr++;
            }
        }
        return leftPtr;
    }

    @Override
    public void swap(int dex1, int dex2) {
        int temp = array[dex1];
        array[dex1] = array[dex2];
        array[dex2] = temp;
        
    }

    @Override
    public int size() {
        return nElems;
    }

    @Override
    public void display() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
        System.out.println("");
    }
}
