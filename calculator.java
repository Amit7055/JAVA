package project_1;

import java.util.Scanner;

public class calculator 
{
	public static void main(String[] args) 
	{
		Scanner obj = new Scanner(System.in);
		int a,b,c;
		
		do
		{
			System.out.println("1.Mul\n2.Sub\n3.Add\n0.Exit:");
			c=obj.nextInt();
			
			switch(c)
			{
			case 1:
				System.out.println("Enter 2 number");
				a=obj.nextInt();
				b=obj.nextInt();
				System.out.println("mul = "+a*b);
				break;
			case 2:
				System.out.println("Enter 2 number");
				a=obj.nextInt();
				b=obj.nextInt();
				System.out.println("sub = "+(a-b));
				break;
			case 3:
				System.out.println("Enter 2 number");
				a=obj.nextInt();
				b=obj.nextInt();
				System.out.println("add = "+(a+b));
				break;
			default:
				if(c==0)
					System.out.println("by Amit");
				else
					System.out.println("!!!!!!!!!!!!!!!!!!Invalid!!!!!!!!!!!!!!!!!!!!");
			}
		}
		while(c!=0);
	}
}
