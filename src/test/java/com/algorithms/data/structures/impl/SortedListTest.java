/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algorithms.data.structures.impl;

import com.algorithms.data.structures.SortedList;
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
public class SortedListTest {

    SortedList<Integer> sortedList;

    public SortedListTest() {
        sortedList = new SortedListImpl<>();
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
    public void insertList() {
        System.out.println("Sorted List Test");
        assertTrue(sortedList.isEmpty());
        sortedList.insert(6);
        sortedList.insert(2);
        sortedList.insert(3);
        sortedList.insert(5);
        sortedList.insert(4);
        sortedList.insert(1);
        sortedList.display();

        System.out.println("Delete some elements");
        assertSame(1, sortedList.removeFirst());
        assertSame(2, sortedList.removeFirst());
        assertSame(3, sortedList.removeFirst());
        sortedList.display();

        System.out.println("Insert again the elements");
        sortedList.insert(3);
        sortedList.insert(2);
        sortedList.insert(1);
        sortedList.display();
        
        assertFalse(sortedList.isEmpty());
        
        assertSame(1, sortedList.removeFirst());
        assertSame(2, sortedList.removeFirst());
        assertSame(3, sortedList.removeFirst());
        assertSame(4, sortedList.removeFirst());
        assertSame(5, sortedList.removeFirst());
        assertSame(6, sortedList.removeFirst());
        assertSame(null, sortedList.removeFirst());
        assertTrue(sortedList.isEmpty());
        
        System.out.println("insert two elements");
        sortedList.insert(3);
        sortedList.insert(1);
        sortedList.display();
    }
}
