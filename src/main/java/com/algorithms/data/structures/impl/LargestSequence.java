/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algorithms.data.structures.impl;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jovani
 */
public class LargestSequence {
    List<Integer> sequence = new ArrayList<Integer>();

    public List<Integer> search(int[] arr) {
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] + 1 == temp) {

            }
        }
        return sequence;
    }
}
