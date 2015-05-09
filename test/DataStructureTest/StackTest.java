package DataStructureTest;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import stackStructure.Stack;
import stackStructure.StackImp;

/**
 *
 * @author Jovani
 */
public class StackTest {

    Stack<Integer> theStack;

    public StackTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        theStack = new StackImp();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testStack() {
        assertNotNull(theStack);
        theStack.push(3);
        assertEquals(theStack.peek(), Integer.valueOf(3));
        assertFalse(theStack.isEmpty());
        assertEquals(theStack.pop(),Integer.valueOf(3));
        assertTrue(theStack.isEmpty());
        assertNull(theStack.peek());
        assertNull(theStack.pop());
    } 
}
