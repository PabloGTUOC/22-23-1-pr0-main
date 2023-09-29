package edu.uoc.ds.adt;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PR0FibArrayTest {
    private PR0FibArray fibArray;

    @Before
    public void setUp(){
        fibArray = new PR0FibArray();
        assertNotNull(fibArray.getFibArray());
    }

    @After
    public void tearDown(){
        fibArray = null;
    }

    @Test
    public void testFibArrayInitialization(){
        int[] expectedFib = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181};
        int[] actualFib = fibArray.getFibArray();

        for (int i = 0; i < expectedFib.length; i++) {
            assertEquals(expectedFib[i], actualFib[i]);
        }
    }

    @Test
    public void testGetIndexOf(){
        // Check some Fibonacci numbers' indices
        assertEquals(5, fibArray.getIndexOf(5));
        assertEquals(8, fibArray.getIndexOf(21));
        assertEquals(-1, fibArray.getIndexOf(7));  // 7 is not in the first 20 Fibonacci numbers
    }

    @Test
    public void testBinarySearch(){
        // Check some Fibonacci numbers' indices using binary search
        assertEquals(5, fibArray.binarySearch(5));
        assertEquals(8, fibArray.binarySearch(21));
        assertEquals(-1, fibArray.binarySearch(7));  // 7 is not in the first 20 Fibonacci numbers
    }
}
