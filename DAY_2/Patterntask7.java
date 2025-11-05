package DAY_2;

import java.util.Scanner;

/*       REVERSE  Equilateral angle triangle
* * * * * 
 * * * * 
  * * * 
   * * 
    * 
 */

public class Patterntask7 {

	public static void main(String[] args) {
		Scanner mu = new Scanner(System.in);
		System.out.println("Enter lines:");
		int a=mu.nextInt();
		for(int i=1;i<=a;i++) {
			for (int k=1;k<i;k++) {
				System.out.print(" ");
			}
			for (int j=i;j<=a;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		mu.close();

	}

}
