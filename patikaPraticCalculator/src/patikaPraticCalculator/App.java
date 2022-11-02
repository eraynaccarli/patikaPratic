package patikaPraticCalculator;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter first number : ");
		double firstNumber = sc.nextDouble();
		System.out.println("enter second number : ");
		double secondNumber = sc.nextDouble();

		char transaction = sc.next().charAt(0);

		switch (transaction) {
			case '+':
				System.out.println("sum result: " + (firstNumber + secondNumber));
				break;
			case '-':
				System.out.println("subtraction result : " + (firstNumber - secondNumber));
				break;
			case '*':
				System.out.println("multiplication result : " + (firstNumber * secondNumber));
				break;
			case '/':
				if (secondNumber == 0)
					System.out.println("0 ile Bölünemez.");
				else {
					System.out.println("division resultu : " + (firstNumber / secondNumber));
					break;
				}
			default:
				System.out.println("Please enter valid value.");
				break;
		}

	}

}
