/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algorithms.data.structures.impl;

import com.algorithms.data.structures.LinkedList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jovani
 */
public class LinkListTest {
    LinkedList<Integer> list;
    
    public LinkListTest() {
        list = new LinkedListiImpl<>();
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    
    @Test
    public void listTest() {
        assertTrue(list.isEmpty());
        assertSame(null, list.removeLast());
        assertSame(null, list.removeFirst());
        assertTrue(list.insertAt(1, null));
        assertFalse(list.removeElement(12));
        list.insertLast(7);
        list.insertFirst(10);
        list.insertFirst(8);
        list.insertFirst(9);
        list.insertLast(11);
        list.insertLast(12);
        assertSame(12, list.removeLast());
        assertSame(9, list.removeFirst());
        assertTrue(list.insertAt(12, 11));
        assertFalse(list.insertAt(13, 13));
        assertTrue(list.removeElement(12));
        assertTrue(list.removeElement(10));
        list.display();
        assertFalse(list.isEmpty());
    }
}
