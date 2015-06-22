
package com.algorithms.data.structures;

/**
 * @author Jovani
 *         <p/>
 *         This implementation suffers from slow insertion,
 *         but it's simpler and is appropriate when the number
 *         of items isn't high or insertion speed isn't critical.
 *         For larger numbers of items, or when speed is critical, the heap is a better choice.
 */
public interface PriorityQueue<T> {
    void enqueue(T data, int priority);

    T dequeue();

    boolean dequeue(T data);

    T peekFront();

    boolean isEmpty();

    int size();
}
