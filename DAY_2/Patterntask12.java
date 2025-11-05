package DAY_2;

import java.util.Scanner;

public class Patterntask12 {

	public static void main(String[] args) {
		 Scanner mu = new Scanner(System.in);
	        System.out.print("Enter lines: ");
	        int a = mu.nextInt();
	        mu.close();

	        for (int i = a / 2; i <= a; i += 2) {
	   
	            for (int j = 1; j < a - i; j += 2) {
	                System.out.print("  ");
	            }
	           
	            for (int j = 1; j <= i; j++) {
	                System.out.print("* ");
	            }
	           
	            for (int j = 1; j <= a - i; j++) {
	                System.out.print("  ");
	            }
	           
	            for (int j = 1; j <= i; j++) {
	                System.out.print("* ");
	            }
	            System.out.println();
	        }

	        for (int i = a; i >= 1; i--) {
	           
	            for (int j = i; j < a; j++) {
	                System.out.print("  ");
	            }
	           
	            for (int j = 1; j <= (i * 2) - 1; j++) {
	                System.out.print("* ");
	            }
	            System.out.println();
	        }

	}

}
