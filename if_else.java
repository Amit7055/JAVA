package project_1;
import java.util.Scanner;


public class if_else 
{
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int a , b ,c;
		System.out.println("Enter number");
		a=obj.nextInt();
		if(a>0)
			System.out.println("Number is +ve");
		
			
		System.out.println("Enter number");
			b=obj.nextInt();
			if(a>0)
				System.out.println("Number is +ve");
			else
				System.out.println("number is -ve");
			
			System.out.println("Enter number od time to repeat");
			c=obj.nextInt();
			
			for(int i = 0 ; i < c ; i++)
			{
				System.out.println("Enter number");
				b=obj.nextInt();
				if(b>0)
					System.out.println("Number is +ve");
				else if(b<0)
					System.out.println("number is -ve");
				else
					System.out.println("Number is neither +ve or -ve");
			}
	}
}
