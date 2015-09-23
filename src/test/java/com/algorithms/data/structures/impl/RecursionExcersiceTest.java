/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algorithms.data.structures.impl;

import com.algorithms.data.structures.RecursionExcersice;
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
public class RecursionExcersiceTest {

    RecursionExcersice recursion;

    public RecursionExcersiceTest() {
        recursion = new RecursionExcersiceImpl();
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
    public void triangleTest() {
        assertEquals(1, recursion.triangle(1));
        assertEquals(6, recursion.triangle(3));
        assertEquals(15, recursion.triangle(5));
        assertEquals(28, recursion.triangle(7));
        assertEquals(500500, recursion.triangle(1000));
        
    }
    
    @Test
    public void factorialTest() {
        assertEquals(1, recursion.triangle(1));
        assertEquals(6, recursion.triangle(3));
        //assertEquals(24, recursion.triangle(4));
        assertNotEquals(40320, recursion.triangle(8));
        
        System.out.println(recursion.factorial(4));
        System.out.println(recursion.factorial(5));
        System.out.println(recursion.factorial(8));
         
        recursion.anagram("Hola");
        recursion.towerHanoi(5);
    }
}
