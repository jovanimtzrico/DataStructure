/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Structure.Data.Interfaces;

/**
 *
 * @author Jovani
 * 
 * This implementation suffers from slow insertion, 
 * but it's simpler and is appropriate when the number 
 * of items isn't high or insertion speed isn't critical.
 * For larger numbers of items, or when speed is critical, the heap is a better choice.
 */
public interface PriorityQueue<T> {
    void enqueue(T data,int priority);
    T dequeue();
    boolean dequeue(T data);
    T peekFront();
    boolean isEmpty();
    int size();
}
