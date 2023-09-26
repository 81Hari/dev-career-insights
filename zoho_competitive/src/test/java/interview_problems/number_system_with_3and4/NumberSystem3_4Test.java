package interview_problems.number_system_with_3and4;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NumberSystem3_4Test {
    @Test
    public void testNthNumber() {
        NumberSystem3_4 ns = new NumberSystem3_4();

        assertEquals(3, ns.nthNumber(1));
        assertEquals(4, ns.nthNumber(2));
        assertEquals(33, ns.nthNumber(3));
        assertEquals(34, ns.nthNumber(4));
        assertEquals(43, ns.nthNumber(5));
        assertEquals(344, ns.nthNumber(10));

    }
}
