package com.learnmaven.mavendemo;

import org.apache.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
	final static Logger logger = Logger.getLogger(App.class);
	
    public static void main( String[] args )
    {
    	System.out.println( "Hello World!" );
        Calculator calc = new Calculator();
        System.out.println(calc.Add(1, 2));
        
        logger.debug("Multiplication output is " + calc.Mult(5, 6));
    }
}
