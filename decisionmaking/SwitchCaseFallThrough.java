package decisionmaking;

public class SwitchCaseFallThrough {

	public static void main(String[] args) {
		int num = 10;
		
		switch(num) {
		case 10:
			System.out.println("10");
		case 20:
			System.out.println("20");
		case 30:
			System.out.println("30");
		default:
			System.out.println("Not valid number");
		}
	}
}