package pl.akademiakodu.AK_Spring_ExerciseMethod_BasicCalculatorTODO.models;

/**
 * Import section
 */
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;


import static org.junit.Assert.*;

/**
 * Class to test calculator average service
 */
public class CalculatorAverageTest {

    private static CalculatorAverage calculator;

    @BeforeClass public static void start(){
        calculator = new CalculatorAverage();
    }

    @AfterClass public static void stop(){
        calculator = null;
    }

    /**
     * This test testing all methods in service
     */
    @Test public void operationTest(){
        assertEquals(calculator.squareOf(8),64);
        assertEquals(calculator.elementOf(9),3);
        assertEquals(calculator.factorial(5),120);
        assertEquals(true,calculator.isPrimeNumber(2));
        assertEquals(true,calculator.isPrimeNumber(13));
        assertEquals(false,calculator.isPrimeNumber(9));
        assertNotEquals(calculator.factorial(4),10);
    }

}