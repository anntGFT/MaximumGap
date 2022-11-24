package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    static Solution solution;
    int[] array;
    int result;


    @BeforeAll
    static void setup(){

        solution = new Solution();
    }

    @Test
    public void arrayContainsOnlyOneNumber(){

        array = new int[] {4};
        result = 0;

        assertEquals(result, solution.maximumGap(array));
    }

    @Test
    public void arrayContainsTwoNumbers(){

        array = new int[] {4,1};
        result = 3;

        assertEquals(result, solution.maximumGap(array));
    }

    @Test
    public void arrayContainsFiveNumbers(){

        array = new int[] {4,1,5,6,22};
        result = 16;

        assertEquals(result, solution.maximumGap(array));
    }
}
