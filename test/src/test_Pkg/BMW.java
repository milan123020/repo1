package test_Pkg;

public class BMW {
	
	public void BMW1()
	{
		
		System.out.println("this is default Method");
		this.BMW2();
	}
	
	public void BMW2()
	{
		
		System.out.println("This is 1 parameterise");
		this.BMW3();
	}
	public void BMW3()
	{
		
		System.out.println("this is 2 parametrise");
		this.BMW5();
	}
	public void BMW4()
	{
		
		System.out.println("this is 3 parametrise");
		this.BMW1();
	}
	public void BMW5()
	{
		System.out.println("this is 4 parametrise");
	}
	
	public static void main(String[] args)
	
	{
		BMW obj=new BMW();
		obj.BMW4();
	}
	
	
	
}
