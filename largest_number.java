package project_1;

import java.util.Scanner;

public class largest_number 
{
	public static void main(String[] args) 
	{
		Scanner obj = new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter 3 numbers : ");
		a=obj.nextInt();
		b=obj.nextInt();
		c=obj.nextInt();
		
		if(a>b && a>c)
			System.out.println(a+" : LARGEST NUMBER : "+a);
		else if(b>a && b>c)
			System.out.println(b+" : LARGEST NUMBER : "+b);
		else
			System.out.println(c+" : LARGEST NUMBER : "+c);
	}
}
