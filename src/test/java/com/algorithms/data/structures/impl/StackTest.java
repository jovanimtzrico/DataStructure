package com.algorithms.data.structures.impl;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.algorithms.data.structures.Stack;
import org.junit.*;

import static org.junit.Assert.*;

/**
 * @author Jovani
 */
public class StackTest {

    Stack<Integer> theStack;

    public StackTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        theStack = new StackImp();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void stackTest() {
        assertNotNull(theStack);
        theStack.push(3);
        assertEquals(theStack.peek(), Integer.valueOf(3));
        assertFalse(theStack.isEmpty());
        assertEquals(theStack.pop(), Integer.valueOf(3));
        assertTrue(theStack.isEmpty());
        assertNull(theStack.peek());
        assertNull(theStack.pop());
    }
}
