package patikaPratikTamBolen;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// girilen sayiya kadar 3 ve 4 e tam bolunen sayilarin ortalamasini alan program
		System.out.print("Please enter number: ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int sum = 0;
		int count = 0;
		for(int i = 0; i < number; i++) {
			if(i % 3 == 0 && i % 4 == 0) {
				count++;
				sum +=i;	
			}
			
		}
		System.out.println("avarage: " + sum/(count-1));
		
		
	}

}
