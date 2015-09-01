/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algorithms.data.structures;

/**
 * @author Jovani
 */
public interface Stack<T> {
    void push(T data);

    T pop();

    T peek();

    void display();

    void display(T data);

    boolean isEmpty();
}
