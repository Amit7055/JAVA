import java.util.Scanner;
class Simple_Interest
{
	public static void main(String agrs[])
	{
		float p,r,si,a;
		int n;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter principle amount ");
		p=obj.nextFloat();
		System.out.println("Enter rate of interst ");
		r=obj.nextFloat();
		System.out.println("Enter number of years :");
		n=obj.nextInt();
		si=(p*r*n)/100;
		System.out.println("Simple interest is "+si);
		a=p+si;
		System.out.println("Total amount is "+a);




	}






}