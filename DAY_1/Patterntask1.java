package DAY_1;

import java.util.Scanner;

        //BINARY SQUARE
/*
0  1  0  1  0 
1  0  1  0  1 
0  1  0  1  0 
1  0  1  0  1 
0  1  0  1  0
*/
public class Patterntask1 {

	public static void main(String[] args) {
	     Scanner mu = new Scanner(System.in);
	     System.out.println("Enter lines:");
	     int a = mu.nextInt();
	     for(int i=1;i<=a;i++) { //col
	    	 for(int j=1;j<=a;j++) { //rows
	    		 if((i+j)% 2==0) {
	    		 System.out.print(" 0 ");
	    		 }else {
	    			 System.out.print(" 1 ");
	    		 }
	    		 
	    	 }
	    	 System.out.println();
	     }
	     mu.close();
	}

}
