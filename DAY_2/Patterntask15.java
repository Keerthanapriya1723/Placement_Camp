package DAY_2;

import java.util.Scanner;

        //Hollow diamond
/*
 *  *
   * *
  *   *
 *     *
*       *
 *     *
  *   *
   * *
    *
 */

public class Patterntask15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of lines: ");

        int n = sc.nextInt();



        // Upper half of the diamond

        for (int i = 1; i <= n; i++) {

            // Print leading spaces

            for (int j = i; j < n; j++) {

                System.out.print(" ");

            }



            // Print stars and spaces inside

            for (int j = 1; j <= (2 * i - 1); j++) {

                if (j == 1 || j == (2 * i - 1))

                    System.out.print("*");

                else

                    System.out.print(" ");

            }

            System.out.println();

        }



        // Lower half of the diamond

        for (int i = n - 1; i >= 1; i--) {

            // Print leading spaces

            for (int j = n; j > i; j--) {

                System.out.print(" ");

            }



            // Print stars and spaces inside

            for (int j = 1; j <= (2 * i - 1); j++) {

                if (j == 1 || j == (2 * i - 1))

                    System.out.print("*");

                else

                    System.out.print(" ");

            }

            System.out.println();

        }



        sc.close();

	}

}
