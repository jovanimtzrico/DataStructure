/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queueStructure;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jovani
 */
public class QueueImp<T> implements Queue<T> {
    private List<T> stackList;
    private int rear;
    private int front;

    public QueueImp() {
        stackList = new ArrayList<T>();
    }
    

    @Override
    public void insert() {
        
    }

    @Override
    public T revome() {
        return null;
    }

    @Override
    public T peekFront() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }
}
