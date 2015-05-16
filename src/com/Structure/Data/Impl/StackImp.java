/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Structure.Data.Impl;

import java.util.ArrayList;
import java.util.List;
import com.Structure.Data.Interfaces.Stack;

/**
 *
 * @author Jovani
 */
public class StackImp<T> implements Stack<T> {

    List<T> stackList;

    public StackImp() {
        stackList = new ArrayList<T>();
    }

    @Override
    public void push(T data) {
        stackList.add(data);
    }

    @Override
    public T pop() {
        if (!stackList.isEmpty()) {
            return stackList.remove(stackList.size() - 1);
        } else {
            return null;
        }
    }

    @Override
    public T peek() {
        if (!stackList.isEmpty()) {
            display(stackList.get(stackList.size() - 1));
        } else {
            System.out.println("The Stack is empty");
            return null;
        }
        return stackList.get(stackList.size() - 1);
    }

    @Override
    public void display() {
        System.out.println("The elements on the Stack");
        for (int i = stackList.size() - 1; i >= 0; i--) {
            System.out.println(stackList.get(i));
        }
    }

    @Override
    public void display(T data) {
        System.out.println(data);
    }

    @Override
    public boolean isEmpty() {
        return stackList.isEmpty();
    }
}
