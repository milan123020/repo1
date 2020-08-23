package test_Pkg;
import java.util.Scanner;


public class double2 {
	
	public static void main(String[] arg)
	{
		int i,j,a,b,k;
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the value of a");
		a= s.nextInt();
		
		System.out.println("Enter the value of b");
		b= s.nextInt();
		
		for(i=1;i<=b;i++) 
		{
			for (j=b;j>i;j--)
			{
				System.out.print(" ");
			}
				for (k=1;k<i*2; k++) 
				{
					System.out.print("*");
				}
				System.out.println("");
			}

		
		
		
		
	}

}
