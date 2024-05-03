package JavaBasics;

public class ReverseString {

	public static void main(String[] args) {

		String s = "Jaspal Raja";

		for (int i = s.length() - 1; i >= 0; i--)

		{

			System.out.println(s.charAt(i));

		}

	}

}