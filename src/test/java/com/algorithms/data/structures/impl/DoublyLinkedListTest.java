/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algorithms.data.structures.impl;

import com.algorithms.data.structures.DoublyLinkedList;
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
public class DoublyLinkedListTest {
    
    private DoublyLinkedList<Integer> dll;
    
    public DoublyLinkedListTest() {
        dll = new DoublyLinkedListImpl<>();
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
    public void doublyLinkedListTest() {
        assertTrue(dll.isEmpty());
        assertNull(dll.deleteFirst());
        dll.insertLast(2);
        assertTrue(dll.deleteElement(2));
        dll.insertFirst(10);
        assertSame(10, dll.deleteFirst());
        dll.insertLast(10);
        assertSame(10, dll.deleteLast());
        dll.insertFirst(11);
        dll.insertFirst(12);
        dll.insertFirst(13);
        dll.insertFirst(14);
        assertSame(14, dll.deleteFirst());
        dll.insertLast(10);
        assertFalse(dll.isEmpty());
        assertSame(10, dll.deleteLast());
        
        dll.insertAt(14, 12);
        dll.deleteElement(13);
        dll.displayForward();
        //dll.displayBackward();
    }
}
