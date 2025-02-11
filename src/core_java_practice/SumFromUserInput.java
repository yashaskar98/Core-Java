package core_java_practice;

import java.util.Scanner;

public class SumFromUserInput {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);// System.in means starndard input stream which is usually take from
											// connected keyboard or Console
		System.out.println("Enter 1st Number");
		int a = sc.nextInt();
		System.out.println("Enter 2nd Number");
		int b = sc.nextInt();
		int c = a+b;
		System.out.println(c);
	}

}
