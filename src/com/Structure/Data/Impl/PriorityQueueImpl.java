/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Structure.Data.Impl;

import com.Structure.Data.Interfaces.PriorityQueue;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jovani
 */
public class PriorityQueueImpl<T> implements PriorityQueue<T>{
    List<Element> queue;
    Element<T> element;

    public PriorityQueueImpl() {
        queue = new ArrayList<>();
    }

    
    @Override
    public void enqueue(T data,int priority) {
        element = new Element(data, priority);
        int position=0;
        for(position=0; position<size(); position++){
            if(queue.get(position).getPriority()<priority){
                break;
            }
        }
        queue.add(position,element);
    }

    @Override
    public T dequeue() {
        return (T) queue.remove(0).getData();
    }

    @Override
    public boolean dequeue(T data) {
        boolean isDequeue = false;
        for (int i = 0; i < queue.size(); i++) {
            if(queue.get(i).getData().equals(data)){
                queue.remove(i);
                isDequeue = true;
            }
        }
        return isDequeue;
    }

    @Override
    public T peekFront() {
        return (T) queue.get(0).getData();
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    @Override
    public int size() {
        return queue.size();
    }
    
    private class Element<T> {
        private T data;
        private int priority;

        public Element(T data, int priority) {
            this.data = data;
            this.priority = priority;
        }

        /**
         * @return the data
         */
        public T getData() {
            return data;
        }

        /**
         * @return the priority
         */
        public int getPriority() {
            return priority;
        }
    }
}
