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
public class BinarySearchRecursionImpl {
    public int search(int low, int high, int find, int[] arr) {
        if (low > high) {
            return -1;
        }
        int middle = (high + low) / 2;
        if (find == arr[middle]) {
            return middle;
        } else if (arr[middle] < find) {
            return search(middle + 1, high, find, arr);
        } else {
            return search(low, middle - 1, find, arr);
        }
    }
}
