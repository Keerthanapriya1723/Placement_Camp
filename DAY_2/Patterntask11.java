package DAY_2;

import java.util.Scanner;

public class Patterntask11 {

	public static void main(String[] args) {
		Scanner mu = new Scanner(System.in);
        System.out.print("Enter lines: ");
        int a = mu.nextInt();//5

        for (int i = 1; i <= a; i++) {
        	        // 1<=5
            for (int j = 1; j <= i; j++) {
            	           //1<=1,2<=1\\false
                System.out.print("* ");
            }
           
           
            for (int j = 1; j <= 2 * (a - i); j++) {
            	          //1<=2*(5-1),1<=2*(4),1<=8...
                System.out.print("  ");
            }
           

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
           
            System.out.println();
        }


        for (int i = a - 1; i >= 1; i--) {
           
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
           

            for (int j = 1; j <= 2 * (a - i); j++) {
                System.out.print("  ");
            }
           

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
           
            System.out.println();
        }

        mu.close();
    }

	}


