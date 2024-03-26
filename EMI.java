/*
program - loan amount
        - rate of interest
	calal total loan amount
        -emi=n*12

*/

import java.util.Scanner;

class EMI
{
	public static void main(String agrs[])
	{
		Scanner obj = new Scanner(System.in);
		int year,EMI;
		float loan,rate,pay,EMI_am,am;
		System.out.println("Enter loan amount : ");
		loan=obj.nextFloat();
		System.out.println("Enter number of year :");
		year=obj.nextInt();
		System.out.println("Enter rate of interest : ");
		rate=obj.nextFloat();
		am=(loan*rate*year)/100;
		pay=loan+am;
		EMI=year*12;
		EMI_am=pay/EMI;
		System.out.println("Total pay loan is "+pay);
		System.out.println("EMI per month is "+EMI_am);



	}


}