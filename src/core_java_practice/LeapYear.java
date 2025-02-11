package core_java_practice;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Year:");
		int year =sc.nextInt();
		/*
		 * test for year 2000,1900,2024 and 2100 for optimal result
		*/
		if((year%4==0 && year%100!=0) || year%400==0 ) {
			System.out.println(year+" is a leap year");
		}else {
			System.out.println(year+" not a leap year");
		}

	}

}
