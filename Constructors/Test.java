package Constructors;

public class Test 
{
	int a, b;
	Test() //constructor declaration
	{
		a=6; //constructor body
		b=7;
		
	}
	public static void main(String[] args) 
	{
		
		Test t=new Test();// constructor calling
		System.out.println(t.a);
		System.out.println(t.b);
	}
}
