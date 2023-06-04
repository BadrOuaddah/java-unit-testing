package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    @Test
    void twoPlusTwo() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        assertEquals(4,simpleCalculator.add(2,2));
    }
    @Test
    void threePlusSeven() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        assertEquals(10,simpleCalculator.add(3,7));
    }
    @Test
    void fourPlusFour() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        assertEquals(8,simpleCalculator.add(4,4));
    }
}