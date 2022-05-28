package Constructors;

import java.util.Scanner;

public class Factorial 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number: ");
		
		int Fact=1;
		int n=sc.nextInt();
		for(int i=1; i<=n;i++) {
			Fact=Fact*i;
			
		}
		System.out.println(Fact);
		
		
		
	}


}
