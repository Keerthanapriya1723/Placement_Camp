package DAY_1;

import java.util.Scanner;
     
           //HOLLOW SQUARE
/*
* * * * * 
*       * 
*       * 
*       * 
* * * * *
*/

public class Pattern2 {

	public static void main(String[] args) {
		
		Scanner mu = new Scanner(System.in);
		System.out.println("Enter lines:"); // 5(user)
		int a = mu.nextInt();
		for (int i = 1; i <= a; i++) { 
			            // 1<=5 1+1
			            // 2<=5 2+1
			            // 3<=5 3+1
			            // 4<=5 4+1
			            // 5<=5 5+1
			for (int j = 1; j <= a; j++) { 
				    //1,5    //1<=5 1+1
				             //2<=5  2+1
				                   //....
				   //2,3,4    //1<=5 1+1
	                            //2<=5 //false ...
				                //5<=5   
				    
				if (i == 1 || i == a || j == 1 || j == a) {
	        //1    	//1 == 1                 
			//2		                  //1==1    //5==5
			//3                      //1==1     //5==5
			//4		                //1==1      //5==5
			//5	              //5==5
					System.out.print("* "); // print in same line
				} else {
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}
		mu.close();
	}
}
