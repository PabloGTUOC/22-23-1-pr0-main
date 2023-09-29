package edu.uoc.ds.adt;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PR0GeometricProgressinArrayTest {
    PR0GeometricProgressionArray pr0Array;

    @Before
    public void setUp(){
        this.pr0Array = new PR0GeometricProgressionArray(2,2,20);
        assertNotNull(this.pr0Array.getGPArray());
    }

    @After
    public void release(){
        this.pr0Array = null;
    }

    @Test
    public void arrayTest(){
        double [] v = this.pr0Array.getGPArray();
        assertEquals(2.0, v[0], 0.0);
        assertEquals(4.0, v[1], 0.0);
        assertEquals(8.0, v[2], 0.0);
        assertEquals(16.0, v[3], 0.0);
        assertEquals(32.0, v[4], 0.0);
        assertEquals(64.0, v[5], 0.0);
        assertEquals(128.0, v[6], 0.0);
        assertEquals(256.0, v[7], 0.0);
        assertEquals(512.0, v[8], 0.0);
        assertEquals(1024.0, v[9], 0.0);
    }

    @Test
    public void searchArray() {
        int index = this.pr0Array.getIndexOf(65);
        assertEquals(-1, index);
        index = this.pr0Array.getIndexOf(256);
        assertEquals(7, index);
        index = this.pr0Array.getIndexOf(512);
        assertEquals(8, index);
    }

    @org.junit.Test
    public void binarySearchArray() {
        int index = this.pr0Array.binarySearch(65);
        assertEquals(-1, index);
        index = this.pr0Array.binarySearch(256);
        assertEquals(7, index);
        index = this.pr0Array.binarySearch(41);
        assertEquals(-1, index);
        index = this.pr0Array.binarySearch(512);
        assertEquals(8, index);
    }
}
