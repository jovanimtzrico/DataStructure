/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algorithms.data.structures;

/**
 *
 * @author Jovani
 */
public interface Partition {
    public void insert(int value);
    public int partitionIt(int left, int right, double pivot);
    public void swap(int dex1, int dex2);
    public int size();
    public void display();
}
