package test_Pkg;

import java.util.*;
import java.util.scanner;


public class Scann1 {

	public int sum(int X1, int b)
	{
		int c;
		c= X1+b;
		return c;
	}
	public int sub( int a, int b)
	{
		int c; 
		c= a-b;
		return c;
	}
	public int mul(int a, int b)
	{
		int c;
		c= a*b;
		return c;
	}
	public int div(int a, int b)
	{
		int c;
		c= a/b;
		return c;
	}
	
	
	
	public static void main(String[] args)
	{
		
		Scann1 obj=new Scann1();
		Scanner s= new Scanner(System.in);
		
		System.out.println("enter First number");
		int x1=s.nextInt();
			
		//x = scanner.nextInt();
	}
	
}
