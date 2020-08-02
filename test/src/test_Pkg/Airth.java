package test_Pkg;

public class Airth {

	int c;
	public static void main(String[] args)
	
	{
		System.out.println("\n The value of ((((10+2)+2)-2)*2/2) is = \n");
		Airth obj=new Airth();
		int A = obj.sum(10, 2);
		int TSum = obj.sum(A, 2);
		System.out.println("The value of Sum is = "+TSum);
		int S= obj.sub(TSum, 2);
		int Q= obj.mul(S, 2);
		obj.div(Q, 2);
		
	}


		public int sum(int a, int b)
			{ 
			int A;
			A= a+b;
			return A;
			}

		public int sub(int d, int e)
		{
			c= d-e;
			System.out.println("The Value of Subtraction is = "+c);
			return c;
		}
		public int mul(int f, int g)
		{
			c=f*g;
			System.out.println("The value of total Multi is = "+c);
			return c;
		
		}
		public void div(int h, int i)
		{
			c=h/i;
			System.out.println("Total is = "+ c);
		}
}
