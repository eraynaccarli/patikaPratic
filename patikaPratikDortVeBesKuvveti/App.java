package patikaPratikDortVeBesKuvveti;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		System.out.print("Enter number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		// girilen sayiya kadar olan 4'un kuvvetleri
		System.out.println("4'un kuvvetleri: ");
		for(int i = 1; i <= n; i*=4) {
			System.out.println(i);
		}
		

		// girilen sayiya kadar olan 5'in kuvvetleri
		System.out.println("5'in kuvvetileri: ");
		for(int j = 1; j <= n; j*=5) {
			System.out.println(j);
		}
	}

}
