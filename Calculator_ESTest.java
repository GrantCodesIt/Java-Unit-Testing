
import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class Calculator_ESTest extends Calculator_ESTest_scaffolding {
    Calculator obj = new Calculator();
    double[] arrPositive = {1,2,3,4};
    double[] arrNegative = {-1,-2,-3,-4};
    double[] arrDouble = {1.5,2.5,3.6,4.1};
    double[] arrEmpty = {};
    //Test Cases
    @Test
    public void sumAddition() {
        //True Statements
        assertEquals(10, obj.sum(arrPositive), 0.0);
        assertEquals(-10, obj.sum(arrNegative), 0.0);
        assertEquals(11.7, obj.sum(arrDouble), 0.0);
        //False Statements
        assertNotEquals(10, obj.sum(arrDouble), 0.0);
        assertNotEquals(1, obj.sum(arrPositive), 0.0);
        assertNotEquals(-1, obj.sum(arrNegative), 0.0);

        assertNotEquals(1.0, obj.sum(arrEmpty), 0.0);
    }
    @Test
    public void subtractTest() {
        //True
        assertEquals(-10, obj.subtract(arrPositive), 0.0);
        assertEquals(10, obj.subtract(arrNegative), 0.0);
        assertEquals(-11.7, obj.subtract(arrDouble), 0.0);
        //False
        assertNotEquals(-1, obj.subtract(arrPositive), 0.0);
        assertNotEquals(1, obj.subtract(arrNegative), 0.0);
        assertNotEquals(-1, obj.subtract(arrDouble), 0.0);
        //Empty
        assertNotEquals(3.0, obj.subtract(arrEmpty), 0.0);
    }
    @Test
    public void multiplicationTest() {
        //True
        assertEquals(24.0, obj.Multiplication(arrPositive), 0.0);
        assertEquals(24.0, obj.Multiplication(arrNegative), 0.0);
        assertEquals(55.349999999999994, obj.Multiplication(arrDouble), 0.0);
        //False
        assertNotEquals(21.0, obj.Multiplication(arrPositive), 0.0);
        assertNotEquals(22.0, obj.Multiplication(arrNegative), 0.0);
        assertNotEquals(54.31, obj.Multiplication(arrDouble), 0.0);
        //Empty
        assertNotEquals(3.0, obj.Multiplication(arrEmpty), 0.0);
    }
    @Test
    public void divideTest() {
        //True
        assertEquals(24.0, obj.divide(48, 2), 0.0);
        assertEquals(0.0, obj.divide(0, 5), 0.0);
        assertEquals(0.5, obj.divide(5, 10), 0.0);
        assertEquals(-5.0, obj.divide(-10.0, 2.0), 0.0);
        //False
        assertNotEquals(21.0, obj.divide(48.0, 2.0), 0.0);
        assertNotEquals(22.0, obj.divide(1.0, 5.0), 0.0);
        assertNotEquals(54.31, obj.divide(5.0, 10.0), 0.0);
        assertNotEquals(-4.0, obj.divide(-10.0, 2.0), 0.0);
        // b == 0
        assertNotEquals(3.0, obj.divide(1, 0), 0.0);
        // a & b == 0
        assertNotEquals(3.0, obj.divide(0, 0), 0.0);
    }
    @Test
    public void squareRootTest() {
        assertEquals(2.0, obj.squareRoot(4.0), 0.0);
        assertEquals(1.7320508075688772, obj.squareRoot(3.0), 0.0);
        assertEquals(Double.MIN_VALUE, obj.squareRoot(-1.0), 0.0);
        assertEquals(316.2283194149442, obj.squareRoot(100000.35), 0.0);
        assertNotEquals(1.0, obj.squareRoot(4.0), 0.0);
        assertNotEquals(1.3, obj.squareRoot(3.0), 0.0);
        assertNotEquals(32.0, obj.squareRoot(-1.0), 0.0);
        assertNotEquals(2.0, obj.squareRoot(100000.35), 0.0);
        assertNotEquals(2.0, obj.squareRoot(0), 0.0);
        assertNotEquals(10.0, obj.squareRoot(1), 0.0);

    }
    @Test
    public void moduloTest() {
        // b < a
        assertEquals(0.0, obj.moduloOfTwoNum(12, 2), 0.0);
        assertEquals(1.0, obj.moduloOfTwoNum(13.0, 2.0), 0.0);
        // a < 0
        assertEquals(1.0, obj.moduloOfTwoNum(-13.0, 2.0), 0.0);
        // decimals
        assertEquals(0.1999999999999993, obj.moduloOfTwoNum(24.2, 2.0), 0.0);
        // b < 0
        assertNotEquals(1.0, obj.moduloOfTwoNum(12, -2), 0.0);
        // a == 0
        assertNotEquals(3.0, obj.moduloOfTwoNum(0, 2), 0.0);
        // b > a
        assertNotEquals(3.0, obj.moduloOfTwoNum(5, 10), 0.0);
        // a == b
        assertNotEquals(1.0, obj.moduloOfTwoNum(10, 10), 0.0);
        // False general statements
        assertNotEquals(6.0, obj.moduloOfTwoNum(12, 2), 0.0);
        assertNotEquals(13.0, obj.moduloOfTwoNum(13.0, 2.0), 0.0);
        assertNotEquals(11.0, obj.moduloOfTwoNum(-13.0, 2.0), 0.0);
        assertNotEquals(4.1999999999999993, obj.moduloOfTwoNum(24.2, 2.0), 0.0);

    }
    @Test
    public void averageTest() {
        assertEquals(2.5, obj.Average(arrPositive), 0.0);
        assertEquals(-2.5, obj.Average(arrNegative), 0.0);
        assertEquals(2.925, obj.Average(arrDouble), 0.0);
        //False Test
        assertNotEquals(2.0, obj.Average(arrPositive), 0.0);
        assertNotEquals(2.5, obj.Average(arrNegative), 0.0);
        assertNotEquals(1.7, obj.Average(arrDouble), 0.0);
    }
    @Test
    public void factorialTest() {
        assertEquals(3628800, obj.factorial(10));
        assertEquals(1, obj.factorial(1));
        assertEquals(1, obj.factorial(0));
        assertEquals(0, obj.factorial(-1));
        //False
        assertNotEquals(3, obj.factorial(10));
        assertNotEquals(2, obj.factorial(1));
        assertNotEquals(32, obj.factorial(0));
    }
}
