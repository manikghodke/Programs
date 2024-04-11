package logical;

import java.util.Scanner;

public class Number {

	public static void main(String[] args) {

		int p = 19;
		int k = 0;

		for (int i = 2; i < p; i++) {
			if (p % i == 0) {
				k = k + 1;
			}
		}
		if (k == 0) {
			System.out.println("Prime Number");
		} else {
			System.out.println("Not prime number");
		}
		System.out.println();
		//////////////////////////////////////////////////////////////////////////////////

		int num = 252;
		int sum = 0;
		int rem;
		int temp = num;
		while (num > 0) {
			rem = num % 10;
			sum = sum * 10 + rem;
			num = num / 10;
		}
		if (sum == temp) {
			System.out.println("Number is palidrom");

		} else {
			System.out.println("Number is not palidrom");
		}
		System.out.println();
//////////////////////////////////////////////////////////////////////////////////////////		

		// Scanner s=new Scanner(System.in);
		// System.out.println("Enter the Number ");
		// int a=s.nextInt();
		int a = 27;

		if (a % 2 == 0) {
			System.out.println("Even");
		} else {

			System.out.println("Odd");
		}
//////////////////////////////////////////////////////////////////////////////////////////////////////
		System.out.println();
		int fact = 1;
		int i1;
		int a1 = 4;
		for (i1 = 1; i1 <= a1; i1++) {
			fact = fact * i1;
		}
		System.out.println("The factorial of a is :" + fact);
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
//		System.out.println();
//
//		int r1=0;
//		int r2=1;
//    	int r3=1;
//		num =10;
//		
//		for(int f=2;f<=num;f++) {
//			r1= r2+r3;
//			r2=r3;
//			r1=r3;
//			System.out.println();
//		}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		System.out.println();

		int num1 = 153;// 27+343+1=371
		int temp1 = num1;
		int sum1 = 0;
		int rem1;
		while (num1 > 0) {
			rem1 = num1 % 10;
			sum1 = sum1 + (rem1 * rem1 * rem1);
			num1 = num1 / 10;

		}
		if (sum1 == temp1) {
			System.out.println("Number is armstrong");
		} else {
			System.out.println("Number is not armstrong");

		}
//////////////////////////////////////////////////////////////////////////////////////////////////////
		System.out.println();
		int x = 10;
		int y = 20;
		System.out.println("Before Swapping");
		System.out.println("Value of x is :" + x);
		System.out.println("Value of y is :" + y);

		// add both the numbers and assign it to first
		x = x + y;
		y = x - y;
		x = x - y;

		System.out.println("after Swapping");
		System.out.println("Value of x is :" + x);
		System.out.println("Value of y is :" + y);
/////////////////////////////////////////////////////////////////////////////////////////////////
		System.out.println();

		int rem2, rev2 = 0;
		int n2 = 1234;

		while (n2 > 0) {

			rem2 = n2 % 10;
			n2 = n2 / 10;
			rev2 = (rev2 * 10) + rem2;

		}
		System.out.println(rev2);

	}

}
