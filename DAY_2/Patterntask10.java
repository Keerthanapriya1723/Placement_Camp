package DAY_2;

import java.util.Scanner;

/*
* * * * * 
 * * * * 
  * * * 
   * * 
    * 
   * * 
  * * * 
 * * * * 
* * * * * 
*/

public class Patterntask10 {

	public static void main(String[] args) {
		Scanner mu = new Scanner (System.in);
		System.out.println("Enter lines:");
		int a=mu.nextInt();//5
		for(int i=1;i<=a-1;i++) {
			for (int k=1;k<i;k++) {
				System.out.print(" ");
			}
			for (int j=i;j<=a;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
         
		for(int i=1;i<=a;i++) {
			for(int k=i;k<a;k++) {
				//1 space --> Equilateral angle triangle
				//2 space --> Left Angled triangle
				System.out.print(" ");	
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
