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
public class NumOcurrence {

    int arr[];
    int find;
    int num = 0;

    public NumOcurrence(int[] arr) {
        this.arr = arr;
    }

    public int numOcc(int find) {
        int fisrt = firstOcur(find);
        int last = lastOc(find);
        return (last + 1) - fisrt;
    }

    public int firstOcur(int find) {
        int pivot = 0, low = 0, high = arr.length - 1;
        int temp = -1;
        while (low <= high) {
            pivot = (high + low) / 2;
            if (arr[pivot] == find) {
                temp = pivot;
                high = pivot - 1;
            } else if (find <= arr[pivot]) {
                high = pivot - 1;
            } else if (find > arr[pivot]) {
                low = pivot + 1;
            }
        }
        return temp;
    }

    public int lastOc(int find) {
        int pivot = 0, low = 0, high = arr.length - 1;
        int temp = -1;
        while (low <= high) {
            pivot = (high + low) / 2;
            if (arr[pivot] == find) {
                temp = pivot;
                low = pivot + 1;

            } else if (find > arr[pivot]) {
                low = pivot + 1;
            } else {
                high = pivot - 1;
            }
        }
        return temp;
    }
}
