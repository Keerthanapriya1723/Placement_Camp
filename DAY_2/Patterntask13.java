package DAY_2;

import java.util.Scanner;

public class Patterntask13 {

	public static void main(String[] args) {
		 Scanner mu = new Scanner(System.in);
	        System.out.print("Enter lines: ");
	        int a = mu.nextInt();

	        for (int i = 1; i <= a; i++) {

	            for (int j = i; j < a; j++) {
	                System.out.print(" ");
	            }

	            for (int j = i; j >= 1; j--) {
	                System.out.print(j);
	            }

	            for (int j = 2; j <= i; j++) {
	                System.out.print(j);
	            }

	            System.out.println();
	        }

	        mu.close();

	}

}
