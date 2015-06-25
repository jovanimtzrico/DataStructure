/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Structure.Data.Impl;

import com.Structure.Data.Interfaces.Queue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Jovani
 */
public class QueueImp<T> implements Queue<T> {

    private final List<T> queueList;

    public QueueImp(List<T> queueList) {
        this.queueList = queueList;
    }

    public QueueImp() {
        queueList = new ArrayList<T>();
    }

    @Override
    public void enqueue(T data) {
        queueList.add(data);
    }

    @Override
    public void enqueue(T... arg) {
        queueList.addAll(Arrays.asList(arg));
    }

    @Override
    public T dequeue() {
        if (!isEmpty()) {
            return queueList.remove(0);
        }
        return null;
    }

    @Override
    public boolean dequeue(T data) {
        if (!isEmpty()) {
            return queueList.remove(data);
        }
        return false;
    }

    @Override
    public T peekFront() {
        if (!isEmpty()) {
            return queueList.get(0);
        }
        return null;
    }

    @Override
    public boolean isEmpty() {
        return queueList.isEmpty();
    }

    @Override
    public int size() {
        return queueList.size();
    }
}
