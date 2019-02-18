package com.learnmaven.mavendemo;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testAddApp()
    {
        assertEquals( 3, new Calculator().Add(1, 2) );
    }
    
    public void testMultApp()
    {
        assertEquals( 6, new Calculator().Mult(2, 3));
    }
    
    public void testMult2App()
    {
    	assertEquals( 18, new Calculator().Mult(6, 3));
    }
    
    public void testMult3App()
    {
    	assertEquals( 20, new Calculator().Mult(5, 4));
    }
}
