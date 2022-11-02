package patikaPraticClassPassed;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		 	int math, physics = 0, chemistry, turkish, music;
	        double avarage;
	        int total = 0;
	        int counter = 0;

	        Scanner input = new Scanner(System.in);

	        System.out.println("math result: ");
	        math = input.nextInt();
	        if (math < 0 || math > 100) {
	            System.out.println("Your grade is not in the 0-100 range.");
	        } else {
	            total += math;
	            counter +=1;
	        }

	        System.out.println("physics result: ");
	        total = input.nextInt();
	        if (physics < 0 || physics > 100) {
	            System.out.println("Your grade is not in the 0-100 range.");
	        } else {
	            total += physics;
	            counter += 1;
	        }

	        System.out.println("chemistry result: ");
	        chemistry = input.nextInt();
	        if (chemistry < 0 || chemistry > 100) {
	            System.out.println("Your grade is not in the 0-100 range.");
	        } else {
	            total += chemistry;
	            counter += 1;
	        }

	        System.out.println("turkish result: ");
	        turkish = input.nextInt();
	        if (turkish < 0 || turkish > 100) {
	            System.out.println("Your grade is not in the 0-100 range.");
	        } else {
	            total += turkish;
	            counter += 1;
	        }

	        System.out.println("music result: ");
	        music = input.nextInt();
	        if (music < 0 || music > 100) {
	            System.out.println("Your grade is not in the 0-100 range.");
	        } else {
	            total += music;
	            counter += 1;
	        }
	        avarage = total / counter;
	        if (avarage > 55) {
	            System.out.println("you passed the class your avarage: " + avarage);
	        } else {
	            System.out.println("you did not pass the class your avarage:: " + avarage);
	        }

	}

}
