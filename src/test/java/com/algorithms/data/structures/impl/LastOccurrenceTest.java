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
public class LastOccurrenceTest {

    LastOccurrence lastOccur;

    public LastOccurrenceTest() {
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
        lastOccur = new LastOccurrence(arr);
        System.out.println(lastOccur.lastOc(3));
        assertSame(4, lastOccur.lastOc(2));
    }
}
