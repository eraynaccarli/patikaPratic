package patikaPratikNegatifDegerGireneKadar;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		int n;
		int total = 0;
		
		Scanner sc = new Scanner(System.in);
		// girilen sayi 2 ve 4'e tam bolunuyorsa toplama ekledik
		do {
			System.out.print("Enter number: ");
			n = sc.nextInt();
			if(n % 2 == 0 && n % 4 == 0) {
				total+=n;
			}
		}
		// tek sayi girilene kadar dongu devam edicek
		while(n % 2 == 0);
			System.out.println("total: " + total);
	}

}
