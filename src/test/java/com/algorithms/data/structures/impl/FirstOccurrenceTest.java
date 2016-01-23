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
public class FirstOccurrenceTest {

    FirstOccurrence first;

    public FirstOccurrenceTest() {
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
    public void test() {
        int[] arr = new int[]{1, 1, 2, 2, 2, 3, 3, 3, 8, 8};
        first = new FirstOccurrence(arr);
        System.out.println(first.firstOcur(8));
        assertSame(8, first.firstOcur(8));
    }
}
