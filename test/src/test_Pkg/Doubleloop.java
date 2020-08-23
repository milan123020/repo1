package test_Pkg;

import java.util.Scanner;



public class Doubleloop {
	
	public static void main(String[] arg)
	{
		int i,j,a=0,b=0,k=0;;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter i value");
		 a = scan.nextInt();
		
		System.out.println("Plz enter j value");
		 b = scan.nextInt();
		
		
		for(i=1; i<=b; i++)
		{
			for(j=i;j<b;j++)
				
			{
				System.out.print("*");
			}
			System.out.println(" ");
			
		}
		
		
	}
}
