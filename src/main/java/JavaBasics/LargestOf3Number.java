package JavaBasics;

public class LargestOf3Number {

	public static void main(String[] args) {
		int a = 10, b = 220, c = 30;

		if (a > b && a > c) {
			System.out.println("A is greatest number: " +a);
		} else if (b > a && b > c) {
			System.out.println("B is greatest number: " +b);
		} 
		//else if (c > a && c > b) {
			//System.out.println("C is greater number");
		//}
		else {
			System.out.println("C is greatest number: " +c);
		}
	}

}
