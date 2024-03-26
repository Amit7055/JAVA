/*program scan product name rate and quqantity
calculate amount
assign 10% discount
net amount*/

import java.util.Scanner;

class Product
{
	public static void main(String agrs[])
	{
		Scanner sr = new Scanner(System.in);
		int q;
		String na;
		float r,a,net,d;
		System.out.println("Enter name of product : ");
		na=sr.next();
		System.out.println("Enter product rate : ");
		r=sr.nextFloat();
		System.out.println("Enter quantity of product : ");
		q=sr.nextInt();
		a=q*r;
		System.out.println("Enter name of product : "+na);
		System.out.println("Total amount is : "+a);
		d=(a*10)/100;	
		System.out.println("Total discount of is 10% : "+d);
		net=a-d;
		System.out.println("Total amount after discount is : "+net);	




	}





}