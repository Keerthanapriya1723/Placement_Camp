package DAY_1;

import java.util.Scanner;
 
                        //Right angle triangle
/*

* 
*  * 
*  *  * 
*  *  *  * 
*  *  *  *  * 

*/


public class Patterntask3 {

	public static void main(String[] args) {
		Scanner mu = new Scanner(System.in);
	
		System.out.println("Enter lines: ");
		int a = mu.nextInt();
		for (int i = 1; i <=a; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(" * ");
			}
			System.out.println();

		}
		mu.close();
	}

}
