package JavaBasics;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {

		/*
		 * int a = 11; if(a%2==0) { System.out.println("Number is even"); } else {
		 * System.out.println("Number is add"); }
		 */

		Scanner reader = new Scanner(System.in);

		System.out.println("Enter a Number: ");
		int num = reader.nextInt();

		if (num % 2 == 0) {
			System.out.println("Number is Even ");
		} else {
			System.out.println("Number is Odd ");
		}

	}

}
