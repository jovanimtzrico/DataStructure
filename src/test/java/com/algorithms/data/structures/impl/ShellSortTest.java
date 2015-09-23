/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algorithms.data.structures.impl;

import com.algorithms.data.structures.ShellSort;
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
public class ShellSortTest {

    ShellSort arr;

    public ShellSortTest() {
        arr = new ShellSortImpl(10);
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
    public void bestCase() {
        System.out.println("\nbestCase");
        for (int j = 0; j < 10; j++) {
            arr.insert(j);
        }
        arr.display();
        arr.sort();
        arr.display();
    }
    
    @Test
    public void randomCase() {
        System.out.println("\nrandomCase");
        for (int j = 1; j <= 10; j++) {
            int n = (int) (java.lang.Math.random() * 99);
            arr.insert(n);
        }
        arr.display();
        arr.sort();
        arr.display();
    }
    
    @Test
    public void worstCase() {
        System.out.println("\nworstCase");
        for (int j = 10; j > 0; j--) {
            arr.insert(j);
        }
        arr.display();
        arr.sort();
        arr.display();
    }
}
