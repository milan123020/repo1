package test_Pkg;

public class Assig3 {


		public Assig3()
		{
			this(2,6,8,9);
			System.out.println("This is a default constructor ");
		}

		public Assig3(int a)
		{
			this();
			System.out.println("This is a one parameterise contstructor ");
		}
		
		public Assig3(int a, int b)
		{
			this(1);
			System.out.println("This is a two parameterise contstructor ");
		}
		
		public Assig3(int a, int b , int c)
		{
			this(1,2);
			System.out.println("This is a Three parameterise contstructor ");
		}
		
		public Assig3(int a, int b, int c, int d)
		{
			
			System.out.println("This is a Four parameterise contstructor ");
		}
		
		public static void main(String[] args)
		
		{	
			
			Assig3 obj= new Assig3(1,2,3);
			
			
		}
	}
