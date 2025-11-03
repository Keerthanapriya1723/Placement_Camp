package DAY_1;

import java.util.Scanner;
              
                        //SQUARE PATTERN
        /* O/P 
                  *  *  *  *  * 
                  *  *  *  *  * 
                  *  *  *  *  * 
                  *  *  *  *  * 
                  *  *  *  *  *  
                    */

public class Pattern1 {

	public static void main(String[] args) {
		Scanner mu = new Scanner (System.in);
		System.out.println("Enter lines:"); //5(user)
		int a = mu.nextInt();
		for(int i=1;i<=a;i++) { //1 to 5 
			for(int j=1;j<=a;j++) { //1 1<=5 , //2 2<=5 goes on
				System.out.print(" * "); //print in same line
			}
			System.out.println();// println for nextline
		}
		mu.close();
	}
}
