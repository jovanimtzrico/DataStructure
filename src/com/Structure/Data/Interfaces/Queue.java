/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Structure.Data.Interfaces;

/**
 *
 * @author Jovani
 */
public interface Queue <T>{
    void enqueue(T data);
    void enqueue(T... data);
    T dequeue();
    boolean dequeue(T data);
    T peekFront();
    boolean isEmpty();
    int size();
}
