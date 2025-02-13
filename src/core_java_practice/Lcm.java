package core_java_practice;

import java.util.Scanner;

public class Lcm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers to find Lcm");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int lcm = 0;
		int numMax = n1 > n2 ? n1 : n2;
		while(true) {
			if(numMax%n1==0 && numMax%n2==0) {
				lcm=numMax;
				break;
			}else {
				numMax++;
			}
		}
		System.out.println("Lcm of "+n1+" and "+n2+" is:"+lcm);

	}

}
