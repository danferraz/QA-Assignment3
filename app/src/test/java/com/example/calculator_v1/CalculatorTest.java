package com.example.calculator_v1;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;

public class CalculatorTest {

    //Testing Sum method
    @Test
    //Test case#1
    //Description: Test to check the addition of two positive integer numbers. First input is 15 and second input is 16. It's expected the result of 31
    public void testSum_input15and16_expect31() {
        //Arrange
        double i = 15;
        double j = 16;
        //Act
        Calculator calculator = new Calculator();
        double result = calculator.Sum(i,j);
        //Assert
        assertEquals(31.0, result, 1);
    }

    @Test
    //Test case#2
    //Description: Test to check the addition of two negative integer numbers. First input is -20 and second input is -10. It's expected the result of -30
    public void testSum_inputNeg20andNeg10_expectNeg30() {
        //Arrange
        double i = -20;
        double j = -10;
        //Act
        Calculator calculator = new Calculator();
        double result = calculator.Sum(i,j);
        //Assert
        assertEquals(-30.0, result, 1);
    }

    @Test
    //Test case#3
    //Description: Test to check the addition one float positive and one integer number. First input is 1.5 and second input is 1. It's expected the float number result of 2.5
    public void testSum_input1point5and1_expect2point5() {
        //Arrange
        double i = 1.5;
        double j = 1;
        //Act
        Calculator calculator = new Calculator();
        double result = calculator.Sum(i,j);
        //Assert
        assertEquals(2.5, result, 1);
    }

    //Testing Subtraction method
    @Test
    //Test case#4
    //Description: Test to check the subtraction of two positive integer numbers. First input is 40 and second input is 5. It's expected the integer positive number result of 35
    public void testSub_input40and5_expect35() {
        //Arrange
        double i = 40;
        double j = 5;
        //Act
        Calculator calculator = new Calculator();
        double result = calculator.Sub(i,j);
        //Assert
        assertEquals(35.0, result, 1);
    }

    @Test
    //Test case#5
    //Description: Test to check the subtraction of two negative integer equal numbers. First input is -15 and second input is also -15. It's expected result ZERO
    public void testSub_inputNeg15andNeg15_expect0() {
        //Arrange
        double i = -15;
        double j = -15;
        //Act
        Calculator calculator = new Calculator();
        double result = calculator.Sub(i,j);
        //Assert
        assertEquals(0.0, result, 1);
    }

    @Test
    //Test case#6
    //Description: Test to check the subtraction of one float positive number and integer number. First input is 4.2 and second input is 1. It's expected the float positive number result of 3.2
    public void testSub_input4point2and1_expect3point2() {
        //Arrange
        double i = 4.2;
        double j = 1.0;
        //Act
        Calculator calculator = new Calculator();
        double result = calculator.Sub(i,j);
        //Assert
        assertEquals(3.2, result, 1);
    }


    //Testing Multiplication method
    @Test
    //Test case#7
    //Description: Test to check the multiplication of two integer equal numbers. First and second input are 10. It's expected the integer positive number result of 100
    public void testMult_input10and10_expect100() {
        //Arrange
        double i = 10;
        double j = 10;
        //Act
        Calculator calculator = new Calculator();
        double result = calculator.Mult(i,j);
        //Assert
        assertEquals(100.0, result, 1);
    }

    @Test
    //Test case#8
    //Description: Test to check the multiplication of two negative numbers. First input is -5 and second input is -4. It's expected the POSITIVE integer number result of 20.
    public void testMult_inputNeg5andNeg4_expect20() {
        //Arrange
        double i = -5;
        double j = -4;
        //Act
        Calculator calculator = new Calculator();
        double result = calculator.Mult(i,j);
        //Assert
        assertEquals(20.0, result, 1);
    }

    @Test
    //Test case#9
    //Description: Test to check the multiplication of one float positive number and neutral number (zero). First input is 6.4 and second input is 0. It's expected ZERO as result.
    public void testMult_input6point4and0_expect0() {
        //Arrange
        double i = 6.4;
        double j = 0;
        //Act
        Calculator calculator = new Calculator();
        double result = calculator.Mult(i,j);
        //Assert
        assertEquals(0, result, 1);
    }


    //Testing Division method
    @Test
    //Test case#10
    //Description: Test to check the division of integer numbers. First input is 6 and second input is 3. It's expected an integer positive number result of 2.
    public void testDiv_input6and3_expect2() {
        //Arrange
        double i = 6;
        double j = 3;
        //Act
        Calculator calculator = new Calculator();
        double result = calculator.Div(i,j);
        //Assert
        assertEquals(2.0, result, 1);
    }

    @Test
    //Test case#11
    //Description: Test to check the division of one negative integer number and one positive integer number. First input is -30 and second input is 20. It's expected the float negative number result of -1.5
    public void testDiv_inputNeg30and20_expectNeg1point5() {
        //Arrange
        double i = -30;
        double j = 20;
        //Act
        Calculator calculator = new Calculator();
        double result = calculator.Div(i,j);
        //Assert
        assertEquals(-1.5, result, 1);
    }

    @Test
    //Test case#12
    //Description: Test to check the division of a number by ZERO. It's expected an error!(In this case, the ArithmeticException.class)
    public void testDiv_input50and0_expectThrowsArithmeticException() {
        //Arrange
        double i = 50;
        double j = 0;
        try {
            //Act
            Calculator calculator = new Calculator();
            double result = calculator.Div(i,j);
        } catch (ArithmeticException e){
            //Assert
            assertThat(e, instanceOf(ArithmeticException.class));
        }
    }


    // Requested tests==================================================
    @Test
    //Test case#13
    //Description: Test to check the division of integer numbers. First input is 6 and second input is 3. It's expected an integer positive number result of 2.
    public void testDiv_input6and3_expect2() {
        //Arrange
        double i = 6;
        double j = 3;
        //Act
        Calculator calculator = new Calculator();
        double result = calculator.Div(i,j);
        //Assert
        assertEquals(2.0, result, 1);
    }




}






