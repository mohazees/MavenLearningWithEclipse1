package com.learnmaven.mavendemo;

public class Calculator 
{
	int Add(int a, int b)
	{
		return a+b;
	}
	
	int Sub(int a, int b)
	{
		return a-b;
	}
	
	int Mult(int a, int b)
	{
		return a*b;
	}
	
	double Divide(int a, int b)
	{
		if(b==0)
			return 0;
		else
			return a/b;
	}
}
