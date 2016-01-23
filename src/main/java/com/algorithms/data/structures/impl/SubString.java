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
public class SubString {

    public int has(String mainStr, String subStr) {
        int count = 0;
        if (subStr.isEmpty() && mainStr.isEmpty()) {
            return 0;
        }
        int index = 0;
        for (int i = 0; i < mainStr.length(); i++) {
            if (index < subStr.length() && mainStr.charAt(i) == subStr.charAt(index++)) {
                if (index == subStr.length()) {
                    count++;
                    index = 0;
                }
            } else {
                index = 0;
            }
        }
        return count;
    }
}
