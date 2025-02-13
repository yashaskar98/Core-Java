package core_java_practice;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to find Factorial");
		int n = sc.nextInt();
		int factorial = 1;
		for(int i=n;i>=1;i--) {
			factorial *= i;
		}
		System.out.println("Factorial of "+n+" is:"+factorial);
	}

}
