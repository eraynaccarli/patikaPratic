package patikaPratikKombinasyon;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
	
		int ntotal = 1;
		int rtotal = 1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter n value: ");
		int n = sc.nextInt();
		
		System.out.print("enter r value: ");
		int r = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			ntotal *= i;
		}
		
		for(int j = 1; j <= r; j++) {
			rtotal *= j;
		}
		
		int difference = n - r;
		int nRtotal = 1;
		
		for(int k = 1; k <= difference; k++) {
			nRtotal *= k;
		}
		
		System.out.println("combination =  " + ntotal / (rtotal * nRtotal));
		
	}

}
