package JavaBasics;

public class SwitchCaseStatement {

	public static void main(String[] args) {
		/*int weekname = 3;
		switch (weekname) {
		case 1:
			System.out.println("Sunday");break;
		case 2:
			System.out.println("Moday");break;
		case 3:
			System.out.println("Tuesday");break;
		case 4:
			System.out.println("Wednesday");break;
		case 5:
			System.out.println("Thrusday");break;
		case 6:
			System.out.println("Friday");break;
		case 7:
			System.out.println("Satruaday");break;
		default:
			System.out.println("invalid number");
		}*/
		
		String weekname = "Sunday";
		switch (weekname) {
		case "Sunday":
			System.out.println("1");break;
		case "Monday":
			System.out.println("2");break;
		case "Tuesday":
			System.out.println("3");break;
		case "Wednesday":
			System.out.println("4");break;
		case "Thrusday":
			System.out.println("5");break;
		case "Friday":
			System.out.println("6");break;
		case "Satruaday":
			System.out.println("7");break;
		default:
			System.out.println("invalid number");
		}
	}
}
