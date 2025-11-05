package DAY_2;

import java.util.Scanner;

      // X- shape number
/* 
 1   5
  2 4 
   3  
  2 4 
 1   5
 */

public class Patterntask14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size:");

        int n = scanner.nextInt();



        for (int i = 0; i < n; i++) 

        {

            for (int j = 0; j < n; j++) 

            {

                if (j == i) 

                {

                    System.out.print(i + 1);

                } 

                else if (j == n - i - 1) 

                {

                    System.out.print(j + 1);

                } 

                else 

                {

                    System.out.print(" ");

                }

            }

            System.out.println();

        }

        scanner.close();

    
	}

}
