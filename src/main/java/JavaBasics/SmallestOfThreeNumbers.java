package JavaBasics;

public class SmallestOfThreeNumbers {

	public static void main(String[] args) {
		int a =10, b=2, c=30;
		
		if(a<b && a<c)
		{
			System.out.println("Smallest number is A: " +a);
		}
		else if(b<a && b<c)
		{
			System.out.println("Smallest number is B: " +b);
		}
		else
		{
			System.out.println("Smallest number is C: " +c);
		}

	}

}
