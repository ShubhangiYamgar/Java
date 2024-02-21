package Basic;

import java.util.Scanner;

public class OddEven {

	public static void main(String args[])
	{
		int i;
	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		i=sc.nextInt();
		
		if(i%2==0) {
			System.out.println("number is Even");
		}
		else
		{
			System.out.println("Number is Odd");
		}
		
	}
}
