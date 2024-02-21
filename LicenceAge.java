package Basic;

import java.util.Scanner;

public class LicenceAge {

	public static void main(String args[])
	{
		int age;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Age of user::");
		age=sc.nextInt();
	   
		if(age>=18) {
			System.out.println("Eligible for Licence ");
		}
		else
		{
			System.out.println("Not Eligible for Licence");
		}
		
	}
}
