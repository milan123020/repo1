package test_Pkg;

import java.util.Scanner;
import java.lang.*;

public class pyramid2 {

	public static void main(String[] arg)
	{
		int a,b,i,j,k;
		
		Scanner s = new Scanner(System.in);
		
		
		System.out.println("Plz enter the value A");
		a= s.nextInt();
		
		System.out.println("Please enter the value of B");
		b = s.nextInt();
		
		for(i=0; i<=a;i++)
		{
			for(j=b;j>i;j--)
			
			{
				for(k=j;k<=j;k++)
				{
				System.out.print(" ");
				}
				System.out.print("*");
			}
		
				System.out.println(" ");
			}
		
			System.out.println(" ");
		}
	
	}
	

