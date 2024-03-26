package project_1;
import java.util.Scanner;
public class age 
{
	public static void main(String[] args) 
	{
		Scanner obj = new Scanner(System.in);
		int age,n;
		System.out.println("Enter number people: ");
		n=obj.nextInt();
		
		for(int i = 0 ; i < n ; i++)
		{
			System.out.println("Enter age : ");
			age=obj.nextInt();
			
			if(age>=18)
				System.out.println("Major");
			else
				System.out.println("Minor");
		}
	}
}
