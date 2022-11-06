package patikaPratikUsluSayiForLoop;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("taban: ");
		int n = sc.nextInt();
		
		System.out.print("üs: ");
		int k = sc.nextInt();
		
		int total = 1;
		
		for(int i = 0; i <= k; i++) {
			total *= n;
			i++;
		}
		System.out.println("sonuc: " + total);
	}

}
