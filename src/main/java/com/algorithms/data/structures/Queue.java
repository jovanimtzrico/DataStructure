package com.algorithms.data.structures;

/**
 * @author Jovani
 */
public interface Queue<T> {
    void enqueue(T data);

    void enqueue(T... data);

    T dequeue();

    boolean dequeue(T data);

    T peekFront();

    boolean isEmpty();

    int size();
}
