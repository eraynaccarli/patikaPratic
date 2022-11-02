package patikaPraticUserLogin;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Username :");
		String username = sc.next();
		System.out.println("Enter Password :");
		String password = sc.next();

		if (username.equals("eray") && password.equals("eray123"))
			System.out.println("Passed");
		else
			System.out.println("Not correct");
	}

}
