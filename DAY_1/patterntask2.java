package DAY_1;

import java.util.Scanner;
 
                 //CONTINOUS NUMBER PATTERN
/*
1 2 3 4 5 
6 7 8 9 10 
11 12 13 14 15 
16 17 18 19 20 
21 22 23 24 25 

*/
public class patterntask2 {

	public static void main(String[] args) {
		
	
		Scanner mu = new Scanner(System.in);
		System.out.println("Enter lines:");
		int a = mu.nextInt();
	    int num=1;
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=a;j++) {
				System.out.print((num++) +" ");
			}
			System.out.println();
		}
                
                  mu.close();
                  
	}

}
