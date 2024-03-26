/*
program -marks shit 
name roll,sub-c++,java,c;total per
*/

import java.util.Scanner;

class Marks
{
	public static void main(String args[])
	{
		Scanner obj = new Scanner(System.in);
		String name;
		int roll,total,c,cc,java;
		float per;
		System.out.println("Enter Student Name : ");
		name=obj.next();
		System.out.println("Enter Roll No. :");
		roll=obj.nextInt();
		System.out.println("Enter Marks of C : ");
		c=obj.nextInt();
		System.out.println("Enter Marks of C++ : ");
		cc=obj.nextInt();
		System.out.println("Enter Marks of Java : ");
		java=obj.nextInt();
		total=c+cc+java;
		per=(total*100)/300;
		System.out.println("Student Name        : "+name);
		System.out.println("Student Roll No.    : "+roll);
		System.out.println(name  +" Marks of C          : "+c);
		System.out.println("Marks of C ++       : "+cc);
		System.out.println("Marks of java       : "+java);
		System.out.println("Student total marks : "+total);
		System.out.println("Student per         : "+per+"%");



	}







}