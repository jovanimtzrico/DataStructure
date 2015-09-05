package com.algorithms.data.structures.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.algorithms.data.structures.PriorityQueue;
import org.junit.*;

/**
 * @author Jovani
 */
public class PriorityQueueTest {
    private PriorityQueue<String> instance;
    
    @Before
    public void setUp() {
        instance = new PriorityQueueImpl<String>();
    }

    @Test
    public void shouldThrowIndexOutOfBoundsException() {
        try {
            instance.dequeue();
            fail("Should have thrown a IndexOutOfBoundsException.");
        } catch (IndexOutOfBoundsException expected) {
        }
    }
    
    @Test
    public void hello() {
        assertTrue(instance.isEmpty());
        instance.enqueue("Hola", 1);
        instance.enqueue("Mundo", 3);
        instance.enqueue("Jovani", 5);
        instance.enqueue("Jovas", 4);
        instance.enqueue("Jovas", 2);
        assertFalse(instance.isEmpty());
        assertEquals(instance.peekFront(), "Jovani");
        instance.dequeue();
        System.out.println(instance.peekFront());
        assertEquals(instance.peekFront(), "Jovas");
        assertEquals(instance.size(), 4);
        assertTrue(instance.dequeue("Jovas"));
        assertEquals(instance.size(), 2);
    }
}
