/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructureTest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import com.Structure.Data.Interfaces.Queue;
import com.Structure.Data.Impl.QueueImp;

/**
 *
 * @author Jovani
 */
public class QueueStructureTest {
    
    Queue<Integer> theQueue;
    
    public QueueStructureTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        theQueue = new QueueImp<Integer>();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void queueTest(){
        assertNotNull(theQueue);
        assertNull(theQueue.dequeue());
        assertTrue(theQueue.isEmpty());
        theQueue.enqueue(12);
        theQueue.enqueue(32);
        theQueue.enqueue(12,45,76,87);
        assertEquals(theQueue.peekFront(),Integer.valueOf(12));
        assertEquals(theQueue.size(), 6);
        assertEquals(theQueue.dequeue(),Integer.valueOf(12));
        assertFalse(theQueue.isEmpty());
    }
}
