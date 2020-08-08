package test_Pkg;

public class con1 {
	
	public con1()
	{
		System.out.println("This is a default constructor ");
	}

	public con1(int a)
	{
		
		System.out.println("This is a one parameterise contstructor ");
	}
	
	public con1(int a, int b)
	{
		System.out.println("This is a two parameterise contstructor ");
	}
	
	public con1(int a, int b , int c)
	{
		this();
		System.out.println("This is a Three parameterise contstructor ");
	}
	
	public con1(int a, int b, int c, int d)
	{
		System.out.println("This is a Four parameterise contstructor ");
	}
	
	public static void main(String[] args)
	
	{	
		
		con1 obj= new con1(1, 2,3,4);
				
		
	}
}
