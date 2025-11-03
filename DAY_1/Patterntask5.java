package DAY_1;

import java.util.Scanner;
 
    //HALF DIAMOND
  
/*
* 
*  * 
*  *  * 
*  *  *  * 
*  *  *  *  * 
*  *  *  *  *  * 
*  *  *  *  * 
*  *  *  * 
*  *  * 
*  * 
* 
*/
public class Patterntask5 {

	public static void main(String[] args) {
		Scanner mu = new Scanner(System.in);
		
		System.out.println("Enter lines: ");
		int a = mu.nextInt(); //a=5
		for (int i = 1; i <=a; i++) {
                     // 1 <=5
			         // 2 <=5
			for (int j = 1; j <=i; j++) {
				           //1<=1 1+1
				           //2<=1 2+1 //false
				         //2<=2 2+1
				         //3<=2 3+1 //false
				System.out.print(" * ");
			}
			System.out.println();
         }
	    
		for (int i = a+1; i >= 1; i--) {
			for (int j = i; j >= 1; j--) {
				System.out.print(" * ");
			}
			System.out.println();

		}
	}

	

}
