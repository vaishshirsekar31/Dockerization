
//Author Name: Vaishnavi Shirsekar.
//Description: Test cases for Calculator class.

/*
package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void testDivideNormal() {
        assertEquals(2.0, calculator.divide(4, 2), "Normal division");
    }

    @Test
    void testDivideByZero() {
        assertEquals(Double.MIN_VALUE, calculator.divide(4, 0), "Division by zero should return Double.MIN_VALUE");
    }

    @Test
    void testDivideResultIsFloatingPoint() {
        assertEquals(2.5, calculator.divide(5, 2), "Division resulting in a floating point");
    }

    @Test
    void testDivideNegativeNumbers() {
        assertEquals(2.5, calculator.divide(-5, -2), "Division with negative numbers");
    }

    @Test
    void testSquareRootPositive() {
        assertEquals(4, calculator.squareRoot(16), "Square root of positive number");
    }

    @Test
    void testSquareRootZero() {
        assertEquals(0, calculator.squareRoot(0), "Square root of zero");
    }

    @Test
    void testSquareRootNegative() {
        assertEquals(Double.MIN_VALUE, calculator.squareRoot(-1), "Square root of negative number");
    }

    @Test
    void testModuloPositiveNumbers() {
        assertEquals(1, calculator.moduloOfTwoNum(5, 2), "Modulo of two positive numbers");
    }

    @Test
    void testModuloByZero() {
        assertEquals(Double.MIN_VALUE, calculator.moduloOfTwoNum(5, 0), "Modulo by zero");
    }


    @Test
    void testModuloFirstOperandSmaller() {
        assertEquals(1, calculator.moduloOfTwoNum(1, 2), "First operand smaller than second operand");
    }

    @Test
    void testAverageNormal() {
        assertEquals(2, calculator.Average(new double[]{1, 2, 3}), "Average of numbers");
    }

    @Test
    void testAverageWithNegativeNumbers() {
        assertEquals(-2, calculator.Average(new double[]{-1, -2, -3}), "Average with negative numbers");
    }

    @Test
    void testAverageSingleElement() {
        assertEquals(2, calculator.Average(new double[]{2}), "Average with single element");
    }

    @Test
    void testAverageEmptyArray() {
        assertThrows(IllegalArgumentException.class, () -> calculator.Average(new double[]{}), "Average of empty array throws IllegalArgumentException");
    }

    @Test
    void testFactorialPositive() {
        assertEquals(120, calculator.factorial(5), "Factorial of a positive number");
    }

    @Test
    void testFactorialZero() {
        assertEquals(1, calculator.factorial(0), "Factorial of zero");
    }

    @Test
    void testFactorialNegative() {
        assertEquals(0, calculator.factorial(-1), "Factorial of negative number");
    }

    @Test
    void testSubtractSingleElement() {
        assertEquals(1.0, calculator.subtract(new double[]{1}), "Subtract with a single element should return the element itself");
    }

    @Test
    void testMultiplicationContainsZero() {
        assertEquals(0.0, calculator.Multiplication(new double[]{1, 2, 0}), "Multiplication with an array containing zero should be 0");
    }

    @Test
    void testModuloFirstOperandZero() {
        assertEquals(0.0, calculator.moduloOfTwoNum(0, 2), "Modulo with first operand as zero should be 0");
    }

    @Test
    void testFactorialUpperBound() {
        assertDoesNotThrow(() -> calculator.factorial(12), "Factorial within int range should not throw");
    }


    @Test
    void testFactorialLargeValue() {
        assertNotEquals(0, calculator.factorial(20), "Factorial of large value testing for non-zero (int overflow handling)");
    }

    @Test
    void testAverageAllSameElements() {
        assertEquals(5.0, calculator.Average(new double[]{5, 5, 5, 5}), "Average of all same elements should be that element");
    }

    @Test
    void testModuloEqualOperands() {
        assertEquals(0.0, calculator.moduloOfTwoNum(5, 5), "Modulo with equal operands should be 0");
    }

    @Test
    void testSquareRootMaxValue() {
        assertEquals(Math.sqrt(Double.MAX_VALUE), calculator.squareRoot(Double.MAX_VALUE), "Square root of the largest double");
    }

    @Test
    void testMultiplicationManySmallValues() {
        double[] smallValues = new double[100];
        java.util.Arrays.fill(smallValues, 1.01);
        assertTrue(calculator.Multiplication(smallValues) > 1.0, "Multiplication of many small values greater than 1");
    }

    @Test
    void testSubtractResultLargeNegative() {
        assertEquals(-Double.MAX_VALUE, calculator.subtract(new double[]{0, Double.MAX_VALUE}), "Subtract resulting in a large negative value");
    }


}


 */


package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;

    // Constants for division tests
    private static final double DIVIDEND = 4;
    private static final double DIVISOR = 2;
    private static final double ZERO_DIVISOR = 0;
    private static final double DIVIDEND_FOR_FLOAT = 5;
    private static final double EXPECTED_DIVISION_RESULT = 2.0;
    private static final double EXPECTED_DIVISION_FLOAT_RESULT = 2.5;
    private static final double EXPECTED_DIVISION_BY_ZERO_RESULT = Double.MIN_VALUE;

    // Constants for square root tests
    private static final double NUMBER_FOR_SQRT = 16;
    private static final double NUMBER_FOR_SQRT_ZERO = 0;
    private static final double NEGATIVE_NUMBER_FOR_SQRT = -1;
    private static final double EXPECTED_SQRT_RESULT = 4;
    private static final double EXPECTED_SQRT_ZERO_RESULT = 0;
    private static final double EXPECTED_SQRT_NEGATIVE_RESULT = Double.MIN_VALUE;

    // Constants for modulo tests
    private static final double MODULO_NUMERATOR = 5;
    private static final double MODULO_DENOMINATOR = 2;
    private static final double MODULO_NUMERATOR_SMALLER = 1;
    private static final double EXPECTED_MODULO_RESULT = 1;
    private static final double EXPECTED_MODULO_BY_ZERO_RESULT = Double.MIN_VALUE;

    // Constants for average tests
    private static final double[] AVERAGE_VALUES = {1, 2, 3};
    private static final double[] AVERAGE_VALUES_SINGLE = {2};
    private static final double[] AVERAGE_VALUES_NEGATIVE = {-1, -2, -3};
    private static final double[] AVERAGE_VALUES_EMPTY = {};
    private static final double EXPECTED_AVERAGE_RESULT = 2;
    private static final double EXPECTED_AVERAGE_NEGATIVE_RESULT = -2;
    private static final double EXPECTED_AVERAGE_SINGLE_RESULT = 2;

    // Constants for factorial tests
    private static final int FACTORIAL_NUMBER = 5;
    private static final int FACTORIAL_ZERO_NUMBER = 0;
    private static final int FACTORIAL_NEGATIVE_NUMBER = -1;
    private static final long EXPECTED_FACTORIAL_RESULT = 120;
    private static final long EXPECTED_FACTORIAL_ZERO_RESULT = 1;
    private static final long EXPECTED_FACTORIAL_NEGATIVE_RESULT = 0;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void testDivideNormal() {
        assertEquals(EXPECTED_DIVISION_RESULT, calculator.divide(DIVIDEND, DIVISOR), "Normal division");
    }

    @Test
    void testDivideByZero() {
        assertEquals(EXPECTED_DIVISION_BY_ZERO_RESULT, calculator.divide(DIVIDEND, ZERO_DIVISOR), "Division by zero should return Double.MIN_VALUE");
    }

    @Test
    void testDivideResultIsFloatingPoint() {
        assertEquals(EXPECTED_DIVISION_FLOAT_RESULT, calculator.divide(DIVIDEND_FOR_FLOAT, DIVISOR), "Division resulting in a floating point");
    }

    @Test
    void testDivideNegativeNumbers() {
        assertEquals(EXPECTED_DIVISION_FLOAT_RESULT, calculator.divide(-DIVIDEND_FOR_FLOAT, -DIVISOR), "Division with negative numbers");
    }

    @Test
    void testSquareRootPositive() {
        assertEquals(EXPECTED_SQRT_RESULT, calculator.squareRoot(NUMBER_FOR_SQRT), "Square root of positive number");
    }

    @Test
    void testSquareRootZero() {
        assertEquals(EXPECTED_SQRT_ZERO_RESULT, calculator.squareRoot(NUMBER_FOR_SQRT_ZERO), "Square root of zero");
    }

    @Test
    void testSquareRootNegative() {
        assertEquals(EXPECTED_SQRT_NEGATIVE_RESULT, calculator.squareRoot(NEGATIVE_NUMBER_FOR_SQRT), "Square root of negative number");
    }

    @Test
    void testModuloPositiveNumbers() {
        assertEquals(EXPECTED_MODULO_RESULT, calculator.moduloOfTwoNum(MODULO_NUMERATOR, MODULO_DENOMINATOR), "Modulo of two positive numbers");
    }

    @Test
    void testModuloByZero() {
        assertEquals(EXPECTED_MODULO_BY_ZERO_RESULT, calculator.moduloOfTwoNum(MODULO_NUMERATOR, ZERO_DIVISOR), "Modulo by zero");
    }

    @Test
    void testModuloFirstOperandSmaller() {
        assertEquals(EXPECTED_MODULO_RESULT, calculator.moduloOfTwoNum(MODULO_NUMERATOR_SMALLER, MODULO_DENOMINATOR), "First operand smaller than second operand");
    }



    @Test
    void testAverageNormal() {
        assertEquals(EXPECTED_AVERAGE_RESULT, calculator.Average(AVERAGE_VALUES), "Average of numbers");
    }

    @Test
    void testAverageWithNegativeNumbers() {
        assertEquals(EXPECTED_AVERAGE_NEGATIVE_RESULT, calculator.Average(AVERAGE_VALUES_NEGATIVE), "Average with negative numbers");
    }

    @Test
    void testAverageSingleElement() {
        assertEquals(EXPECTED_AVERAGE_SINGLE_RESULT, calculator.Average(AVERAGE_VALUES_SINGLE), "Average with single element");
    }

    @Test
    void testAverageEmptyArray() {
        assertThrows(IllegalArgumentException.class, () -> calculator.Average(AVERAGE_VALUES_EMPTY), "Average of empty array throws IllegalArgumentException");
    }

    @Test
    void testFactorialPositive() {
        assertEquals(EXPECTED_FACTORIAL_RESULT, calculator.factorial(FACTORIAL_NUMBER), "Factorial of a positive number");
    }

    @Test
    void testFactorialZero() {
        assertEquals(EXPECTED_FACTORIAL_ZERO_RESULT, calculator.factorial(FACTORIAL_ZERO_NUMBER), "Factorial of zero");
    }

    @Test
    void testFactorialNegative() {
        assertEquals(EXPECTED_FACTORIAL_NEGATIVE_RESULT, calculator.factorial(FACTORIAL_NEGATIVE_NUMBER), "Factorial of negative number");
    }

    // Additional test cases not previously provided
    @Test
    void testSubtractSingleElement() {
        assertEquals(EXPECTED_AVERAGE_SINGLE_RESULT, calculator.subtract(AVERAGE_VALUES_SINGLE), "Subtract with a single element should return the element itself");
    }

    @Test
    void testFactorialUpperBound() {
        assertDoesNotThrow(() -> calculator.factorial(12), "Factorial within int range should not throw");
    }

    @Test
    void testFactorialLargeValue() {
        assertNotEquals(EXPECTED_FACTORIAL_NEGATIVE_RESULT, calculator.factorial(20), "Factorial of large value testing for non-zero (int overflow handling)");
    }

    @Test
    void testAverageAllSameElements() {
        double allSameElementsValue = 5.0;
        assertEquals(allSameElementsValue, calculator.Average(new double[]{allSameElementsValue, allSameElementsValue, allSameElementsValue, allSameElementsValue}), "Average of all same elements should be that element");
    }



    @Test
    void testSquareRootMaxValue() {
        assertEquals(Math.sqrt(Double.MAX_VALUE), calculator.squareRoot(Double.MAX_VALUE), "Square root of the largest double");
    }

    @Test
    void testMultiplicationManySmallValues() {
        double smallValue = 1.01;
        double[] smallValues = new double[100];
        java.util.Arrays.fill(smallValues, smallValue);
        assertTrue(calculator.Multiplication(smallValues) > EXPECTED_FACTORIAL_ZERO_RESULT, "Multiplication of many small values greater than 1");
    }

    @Test
    void testSubtractResultLargeNegative() {
        assertEquals(-Double.MAX_VALUE, calculator.subtract(new double[]{ZERO_DIVISOR, Double.MAX_VALUE}), "Subtract resulting in a large negative value");
    }


}



