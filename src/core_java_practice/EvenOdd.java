package core_java_practice;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);// System.in means starndard input stream which is usually take from
											// connected keyboard or Console
		System.out.println("Enter Number");
		int a = sc.nextInt();
		if(a%2==0) {
			System.out.println(a+" is an Even number");
		}else {
			System.out.println(a+" is an Odd number");
		}

	}

}
