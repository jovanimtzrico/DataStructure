/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algorithms.data.structures.impl;

import com.algorithms.data.structures.RecursionExcersice;

/**
 *
 * @author Jovani
 */
public class RecursionExcersiceImpl implements RecursionExcersice {

    @Override
    public int triangle(int n) {
        if (n == 0) {
            return 0;
        }
        return n + triangle(n - 1);
    }

    @Override
    public int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return (n * factorial(n - 1));
    }

    @Override
    public void anagram(String str) {
        dooAnagram("", str);
    }
    
    public void dooAnagram(String prefix, String word) {
        if(word.length() <= 0){
            System.out.println(prefix+word);
            return;
        }else{
            for(int i = 0; i<word.length();i++){
            dooAnagram(prefix+word.charAt(0), word.substring(1, word.length()));
            word = rotate(word);
            }
        }
    }

    public String rotate(String str) {
         char pivote = str.charAt(0);
         String leftString = str.substring(1, str.length());
         return leftString.concat(String.valueOf(pivote));
    }
    
    @Override
    public void towerHanoi(int disk){
        doTowers(disk, 'A', 'B', 'C');
    }
    
    public void doTowers(int topN, char from, char inter, char to){
        if(topN==1){
            System.out.println("Disk 1 from " + from + " to "+to);
        }else{
            doTowers(topN-1, from, to, inter);
            System.out.println("Disk " + topN +" from " + from + " to "+ to);
            doTowers(topN-1, inter, from, to);
        }
    }
}
