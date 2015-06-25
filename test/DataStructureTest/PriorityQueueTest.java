/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructureTest;

import com.Structure.Data.Impl.PriorityQueueImpl;
import com.Structure.Data.Interfaces.PriorityQueue;
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
public class PriorityQueueTest {
    PriorityQueue<String> theQueue;
    public PriorityQueueTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        theQueue = new PriorityQueueImpl<String>();
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void test() {
        assertTrue(theQueue.isEmpty());
        theQueue.enqueue("Hola", 1);
        theQueue.enqueue("Mundo", 3);
        theQueue.enqueue("Jovani", 5);
        theQueue.enqueue("Jovas", 4);
        theQueue.enqueue("Jovas", 2);
        assertFalse(theQueue.isEmpty());
        assertEquals(theQueue.peekFront(),"Jovani");
        theQueue.dequeue();
        System.out.println(theQueue.peekFront());
        assertEquals(theQueue.peekFront(),"Jovas");
        assertEquals(theQueue.size(), 4);
        assertTrue(theQueue.dequeue("Jovas"));
        assertEquals(theQueue.size(), 2);
        assertFalse(theQueue.dequeue("Jovani"));
        assertTrue(theQueue.dequeue("Hola"));
        assertTrue(theQueue.dequeue("Mundo"));
        assertFalse(theQueue.dequeue("Mundo"));
        assertTrue(theQueue.isEmpty());
        assertEquals(theQueue.size(), 0);
        theQueue.dequeue();
        

    }
}
