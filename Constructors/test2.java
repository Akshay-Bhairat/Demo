package Constructors;

public class test2 
{
	int a, b, c;
	test2(int k, int j)
	{
		a=k;
		b=j;
		c=a+b;
	}
	public static void main(String[] args) 
	{
		test2 t= new test2(8,7);
		System.out.print(t.c);
		
	}
	

}
