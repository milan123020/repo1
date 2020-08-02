package test_Pkg;

public class Assign2 {
	
	int C;
	public static void main(String[] args)
	{
		System.out.println("\n The Value of ((((10-2)+2)-2)*2)/2) is = \n");
		Assign2 obj=new Assign2();
		int Sub= obj.Sub(10,2);
		int TSum= obj.Sum(Sub, 2);
		int TSub= obj.Sub(TSum, 2);
		int TMul= obj.Mul(TSub, 2);
		int Total = obj.Div(TMul, 2);
		System.out.println("\n The total value of Expression is = "+ Total);
		
		
	}
	
	public int Sub(int A, int B)
	{
		C= A-B;
		return C;
		
	}
	public int Sum(int A, int B)
	{
		int TS = A+B;
		return TS;
	}

	public int Mul(int A, int B)
	{
		int MU = A*B;
		return MU;
	}
	
	public int Div(int A, int B)
	{
		int Div = A/B;
		return Div;
	}
}
