/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algorithms.data.structures.impl;

import com.algorithms.data.structures.DoubleEndedList;
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
public class DoubleEndedLinkTest {
    DoubleEndedList<Integer> del;
    
    public DoubleEndedLinkTest() {
        del = new DoubleEndedListImpl<>();
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
    public void doubleEndedList() {
        assertTrue(del.isEmpty());
        assertSame(null, del.removeLast());
        del.insertLast(12);
        del.insertFirst(10);
        del.insertFirst(11);
        del.insertLast(9);
        assertSame(11, del.removeFirst());
        assertTrue(del.removeElement(12));
        assertSame(9, del.removeLast());
        del.display();
        assertFalse(del.isEmpty());
    }


}
