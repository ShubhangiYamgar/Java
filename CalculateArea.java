package Basic;

import java.util.Scanner;

public class CalculateArea {

	public static void main(String args[]) {
		
		int length, width ,areaOfRectangle;
		float areaOfCircle ;
		
		float pi=3.14f, radius;
		float b,h;
		double areaOfTriangle;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter length and Width of Rectangle::");
		length=sc.nextInt();
		width=sc.nextInt();
		
		areaOfRectangle=length*width;
		
		System.out.println("Area of Rectangle :"+areaOfRectangle);
		
		//Area of circle

		System.out.println("enter Radius of circle::");
		radius=sc.nextInt();

		areaOfCircle=pi*radius*radius;
		 
		System.out.println("Area of Circle :"+areaOfCircle);

        //Area of triangle
		
		System.out.println("enter b and h of Triangle::");
		b=sc.nextInt();
		h=sc.nextInt();
		
		areaOfTriangle=(b*h)/2;
		System.out.println("Area of Triangle :"+areaOfTriangle);

		
	}
}
