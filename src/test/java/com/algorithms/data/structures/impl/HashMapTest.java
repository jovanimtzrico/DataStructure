/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algorithms.data.structures.impl;

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
public class HashMapTest {

    HashMap hash;

    public HashMapTest() {
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
    public void linkTest() {
        HashLinkedList list = new HashLinkedList();
        list.add(new HashLinkedList.Node("Jovani", "Rico"));
        assertSame("Rico", list.get("Jovani"));
        list.displayList();
        assertTrue(list.delete("Jovani"));
        //assertFalse(list.delete("Jovani"));
        //assertTrue(list.delete("Jovani"));
        list.displayList();
    }

    //@Test
    public void test() {
        hash = new HashMap();

        assertNull(hash.get("Jovani"));
        hash.put("Jovani", "Rico");
        assertSame("Rico", hash.get("Jovani"));
        hash.put("Nombre", "Jovani");
        assertSame("Jovani", hash.get("Nombre"));
        hash.put("Apellido", "Martinez");
        assertSame("Martinez", hash.get("Apellido"));
        assertSame("Jovani", hash.get("Nombre"));
        hash.displayTable();
        assertTrue(hash.delete("Jovani"));
        hash.displayTable();
        System.out.println("com.algorithms.data.structures.impl.HashMapTest.test()");
        System.out.println(hash.delete("Jovani"));
        //assertFalse(hash.delete("Jovani"));
        //assertNull(hash.get("Jovani"));
        //hash.displayTable();

    }
}
