package patikaPraticDescSort;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
	
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter first number: ");
		int firstNumber = sc.nextInt();
		System.out.println(" enter second number: ");
		int secondNumber = sc.nextInt();
		System.out.println(" enter third number: ");
		int thirdNumber = sc.nextInt();
		
		if(firstNumber < secondNumber && firstNumber < thirdNumber) {
			if(secondNumber < thirdNumber)
				System.out.println(firstNumber + "<" + secondNumber + "<" + thirdNumber);
			else
				System.out.println(firstNumber  + "<" + thirdNumber  + "<" + secondNumber);
		}
		else if(secondNumber < firstNumber && firstNumber < thirdNumber) {
			if(firstNumber < thirdNumber)
				System.out.println(thirdNumber + "<" + firstNumber + "<" + secondNumber);
			else
				System.out.println(secondNumber + "<" + thirdNumber + "<" + firstNumber);
				
		}
		else {
			if(secondNumber < firstNumber)
				System.out.println(thirdNumber + "<" + secondNumber + "<" + firstNumber);
			else
				System.out.println(thirdNumber + "<" + firstNumber + "<" + secondNumber);
				
		}
		
	}

}
