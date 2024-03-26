package project_1;
import java.util.Scanner;
public class switch_1 
{
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int n,a;
		do {
			System.out.println("1.Square\n2.Cube\n0.Exit");
			n=obj.nextInt();
			
			switch(n)
			{
			case 1:
				System.out.println("Enter number :");
				a=obj.nextInt();
				//a=a*a;
				System.out.println("Square of "+a+" is "+a*a);
				break;
			case 2:
				System.out.println("Enter number :");
				a=obj.nextInt();
				//a=a*a;
				System.out.println("Cube of "+a+" is "+a*a*a);
				break;
			case 0:
				System.out.println("thanks !!!!");
				break;
			default:
				System.out.println("invalid !!!!");
				break;
			}
		}
		while(n!=0);
	}

}
