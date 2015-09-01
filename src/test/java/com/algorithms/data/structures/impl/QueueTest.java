/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algorithms.data.structures.impl;

import com.algorithms.data.structures.Queue;
import org.junit.*;

import static org.junit.Assert.*;

/**
 * @author Jovani
 */
public class QueueTest {

    Queue<Integer> theQueue;

    public QueueTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        theQueue = new QueueImp<Integer>();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void queueTest() {
        assertNotNull(theQueue);
        assertNull(theQueue.dequeue());
        assertTrue(theQueue.isEmpty());
        theQueue.enqueue(12);
        theQueue.enqueue(32);
        theQueue.enqueue(12, 45, 76, 87);
        assertEquals(theQueue.peekFront(), Integer.valueOf(12));
        assertEquals(theQueue.size(), 6);
        assertEquals(theQueue.dequeue(), Integer.valueOf(12));
        assertFalse(theQueue.isEmpty());
    }
}
