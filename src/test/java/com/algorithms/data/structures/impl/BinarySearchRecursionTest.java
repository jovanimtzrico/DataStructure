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
public class BinarySearchRecursionTest {

    BinarySearchRecursionImpl binary;

    public BinarySearchRecursionTest() {
        binary = new BinarySearchRecursionImpl();
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void test() {
        int[] arr = new int[]{2, 1, 3, 4, 5, 6, 7, 8, 9};
        assertSame(3, binary.search(0, arr.length, 4, arr));
    }
}
