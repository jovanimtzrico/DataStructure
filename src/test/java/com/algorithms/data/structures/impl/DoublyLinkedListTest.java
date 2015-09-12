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
    public void InsertDeleteFirst() {
        System.out.println("InsertDeleteFirst Test");
        //List is empty
        assertTrue(dll.isEmpty());
        //There are no elements in the list
        assertNull(dll.deleteFirst());
        dll.insertFirst(3);
        dll.insertFirst(2);
        dll.insertFirst(1);
        assertFalse(dll.isEmpty());
        //Display List Forward
        dll.displayForward();
        //Delete First
        assertSame(1, dll.deleteFirst());
        assertSame(2, dll.deleteFirst());
        assertSame(3, dll.deleteFirst());
        //List is empty
        assertTrue(dll.isEmpty());
    }
    
    @Test
    public void insertDeleteLast() {
        System.out.println("InsertDeleteLast Test");
        //List is empty
        assertTrue(dll.isEmpty());
        //There are no elements in the list
        assertNull(dll.deleteLast());
        dll.insertLast(3);
        dll.insertLast(2);
        dll.insertLast(1);
        assertFalse(dll.isEmpty());
        //Display List Backward
        dll.displayBackward();
        //Delete First
        assertSame(1, dll.deleteLast());
        assertSame(2, dll.deleteLast());
        assertSame(3, dll.deleteLast());
        //List is empty
        assertTrue(dll.isEmpty());
        
    }
    
    @Test
    public void insertDeleteAt() {
        System.out.println("InsertDeleteAt Test");
        //List is empty
        assertTrue(dll.isEmpty());
        //There are no elements in the list
        assertFalse(dll.deleteElement(2));
        dll.insertFirst(1);
        assertTrue(dll.insertAt(3, 1));
        assertTrue(dll.insertAt(2, 3));
        assertFalse(dll.insertAt(4, 5));
        assertFalse(dll.isEmpty());
        dll.displayForward();
        //Delete First
        assertTrue(dll.deleteElement(3));
        assertTrue(dll.deleteElement(1));
        assertTrue(dll.deleteElement(2));
        assertFalse(dll.deleteElement(3));
        //List is empty
        assertTrue(dll.isEmpty());
    }
}
