package com.mycompany.esercitazionejunit;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author informatica
 */
public class NumberHelperTest {
    
    public NumberHelperTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    
     /**
     * Test of isEven method, of class NumberHelper.
     */
    @org.junit.jupiter.api.Test
    public void testIsEven() {
        System.out.println("isEven");
        NumberHelper instance = new NumberHelper(5);
        boolean expResult = false;
        boolean result = instance.isEven();
        assertEquals(expResult, result);
    }
    
    /**
    * Test of isEven method, of class NumberHelper.
    */
    @org.junit.jupiter.api.Test
    public void testIsEven1() {
        System.out.println("isEven");
        NumberHelper instance = new NumberHelper(0);
        boolean expResult = false;
        boolean result = instance.isEven();
        assertEquals(expResult, result);
    }
    
    /**
    * Test of isEven method, of class NumberHelper.
    */
    @org.junit.jupiter.api.Test
    public void testIsEven2() {
        System.out.println("isEven");
        NumberHelper instance = new NumberHelper(1);
        boolean expResult = false;
        boolean result = instance.isEven();
        assertEquals(expResult, result);
    }

    /**
     * Test of isOdd method, of class NumberHelper.
     */
    @org.junit.jupiter.api.Test
    public void testIsOdd() {
        System.out.println("isOdd");
        NumberHelper instance = new NumberHelper(5);
        boolean expResult = true;
        boolean result = instance.isOdd();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isOdd method, of class NumberHelper.
     */
    @org.junit.jupiter.api.Test
    public void testIsOdd1() {
        System.out.println("isOdd");
        NumberHelper instance = new NumberHelper(0);
        boolean expResult = false;
        boolean result = instance.isOdd();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isOdd method, of class NumberHelper.
     */
    @org.junit.jupiter.api.Test
    public void testIsOdd2() {
        System.out.println("isOdd");
        NumberHelper instance = new NumberHelper(1);
        boolean expResult = true;
        boolean result = instance.isOdd();
        assertEquals(expResult, result);
    }

    /**
     * Test of sum method, of class NumberHelper.
     */
    @org.junit.jupiter.api.Test
    public void testSum() {
        System.out.println("sum");
        int n = 2;
        NumberHelper instance = new NumberHelper(5);
        int expResult = 7;
        int result = instance.sum(n);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of sum method, of class NumberHelper.
     */
    @org.junit.jupiter.api.Test
    public void testSum1() {
        System.out.println("sum");
        int n = 1;
        NumberHelper instance = new NumberHelper(8);
        int expResult = 9;
        int result = instance.sum(n);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of sum method, of class NumberHelper.
     */
    @org.junit.jupiter.api.Test
    public void testSum2() {
        System.out.println("sum");
        int n = 0;
        NumberHelper instance = new NumberHelper(13);
        int expResult = 13;
        int result = instance.sum(n);
        assertEquals(expResult, result);
    }

    /**
     * Test of isPrime method, of class NumberHelper.
     */
    @org.junit.jupiter.api.Test
    public void testIsPrime() {
        System.out.println("isPrime");
        NumberHelper instance = new NumberHelper(123);
        boolean expResult = false;
        boolean result = instance.isPrime();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isPrime method, of class NumberHelper.
     */
    @org.junit.jupiter.api.Test
    public void testIsPrime1() {
        System.out.println("isPrime");
        NumberHelper instance = new NumberHelper(41);
        boolean expResult = true;
        boolean result = instance.isPrime();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isPrime method, of class NumberHelper.
     */
    @org.junit.jupiter.api.Test
    public void testIsPrime2() {
        System.out.println("isPrime");
        NumberHelper instance = new NumberHelper(1);
        boolean expResult = false;
        boolean result = instance.isPrime();
        assertEquals(expResult, result);
    }

    /**
     * Test of isDivisibleBy method, of class NumberHelper.
     */
    @org.junit.jupiter.api.Test
    public void testIsDivisibleBy() {
        System.out.println("isDivisibleBy");
        int n = 2;
        NumberHelper instance = new NumberHelper(5);
        boolean expResult = false;
        boolean result = instance.isDivisibleBy(n);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isDivisibleBy method, of class NumberHelper.
     */
    @org.junit.jupiter.api.Test
    public void testIsDivisibleBy1() {
        System.out.println("isDivisibleBy");
        int n = 1;
        NumberHelper instance = new NumberHelper(8);
        boolean expResult = true;
        boolean result = instance.isDivisibleBy(n);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isDivisibleBy method, of class NumberHelper.
     */
    @org.junit.jupiter.api.Test
    public void testIsDivisibleBy2() {
        System.out.println("isDivisibleBy");
        int n = 0;
        NumberHelper instance = new NumberHelper(10);
        boolean expResult = false;
        boolean result = instance.isDivisibleBy(n);
        assertEquals(expResult, result);
    }
    
}
