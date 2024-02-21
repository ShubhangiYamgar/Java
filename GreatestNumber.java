package Basic;

import java.util.Scanner;

public class GreatestNumber {

	public static void main(String args[]) 
	{
	
	int num1,num2,num3;
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter three numbers");
	num1=sc.nextInt();
	num2=sc.nextInt();
	num3=sc.nextInt();
	
	
	if(num1>num2 || num1>num2) {
		System.out.println("number 1 is greater " +num1);
		
	}
	else if(num2>num1 || num2>num3) {
		System.out.println("number 2 is grater " +num2);
	}
	else {
		System.out.println("Number 3 is greater " +num3);
	}
}
}