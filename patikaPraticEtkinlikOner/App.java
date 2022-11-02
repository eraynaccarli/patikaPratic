package patikaPraticEtkinlikOner;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter temperature degree : ");
		int heat = sc.nextInt();

		if (heat < 5) {
			System.out.println("You can ski.");
		}

		else if (heat >= 5 && heat <= 15) {
			System.out.println("You can go to the cinema.");
		}

		else if (heat > 15 && heat <= 25) {
			System.out.println("You can go to the picnic.");
		}

		else if (heat > 25) {
			System.out.println("You can go swim.");
		}

		else {
			System.out.println("Error! false input");
		}
	}

}
