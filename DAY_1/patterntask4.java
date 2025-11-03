package DAY_1;

import java.util.Scanner;
                        //REVERSE TRIANGLE
/*
 
*  *  *  *  * 
*  *  *  * 
*  *  * 
*  * 
* 

*/

public class patterntask4 {

	public static void main(String[] args) {
		Scanner mu = new Scanner(System.in);
		System.out.println("Enter lines:");
		int a = mu.nextInt();
		for (int i = a; i >= 1; i--) {
			for (int j = i; j >= 1; j--) {
				System.out.print(" * ");
			}
			System.out.println();

		}
		mu.close();
	}

}
