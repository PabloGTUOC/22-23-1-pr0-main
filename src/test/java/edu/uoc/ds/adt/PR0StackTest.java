package edu.uoc.ds.adt;

import org.junit.After;
import org.junit.Before;
import java.time.LocalDate;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PR0StackTest {

    PR0Stack pr0Stack;

    private void fillStack() {
        LocalDate initialDate = LocalDate.of(2023, 9, 28);
        int offset = 2;

        for (int i = 0; i < pr0Stack.CAPACITY; i++) {
            pr0Stack.push(initialDate.plusDays(i * offset));
        }
    }

    @Before
    public void setUp() {
        this.pr0Stack = new PR0Stack();

        assertNotNull(this.pr0Stack.getStack());
        this.fillStack();
    }

    @After
    public void release() {
        this.pr0Stack = null;
    }

    @org.junit.Test
    public void stackTest() {
        assertEquals(this.pr0Stack.CAPACITY, this.pr0Stack.getStack().size());

        assertEquals("10/16, 10/14, 10/12, 10/10, 10/08, 10/06, 10/04, 10/02, 09/30, 09/28", this.pr0Stack.clearAllStack());

        assertEquals(0, this.pr0Stack.getStack().size());
    }
}
