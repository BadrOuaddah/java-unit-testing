package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraderTest {
    @Test
    void fiftyNineShouldReturnF(){
        Grader grader = new Grader();
        assertEquals('F',grader.determineLetterGrader(59));
    }
    @Test
    void seventyNineShouldReturnC(){
        Grader grader = new Grader();
        assertEquals('C',grader.determineLetterGrader(79));
    }
}