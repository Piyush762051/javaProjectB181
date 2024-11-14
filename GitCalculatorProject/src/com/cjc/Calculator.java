package com.cjc;

public class Calculator
{
	public void add()
	{
		System.out.println("Addition");
	}
	
	public void sub(int a)
	{
		System.out.println("Subract");
	}
	
	public int Div()
	{
		System.out.println("Divison");
		return 10;
		
	}
	
	public String mul(int b)
	{
		System.out.println("Multipe");
		return "abc";
		
	}
	
	public static void main(String[] args) 
	{
		Calculator cl=new Calculator();
		
		cl.add();
		
		cl.sub(5);
		
		String s=cl.mul(15);
		System.out.println(s);
		
		int p=cl.Div();
		System.out.println(p);
		
		
		
	}

}
