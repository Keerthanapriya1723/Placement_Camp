package DAY_2;

import java.util.Scanner;
/*
* 
* * 
* * * 
* * * * 
* * * * * 
* * * * 
* * * 
* * 
* 
*/
public class Patterntask8 {

	public static void main(String[] args) {
		Scanner mu = new Scanner (System.in);
		System.out.println("Enter lines:");
		int a=mu.nextInt();//5
		for(int i=1;i<=a-1;i++) {
			      //1<=5
			      //2<=5 ,//3<=5,4<=5,5<=5
			for(int k=i;k<a;k++) {
				  //k=1 1<5,2<5,3<5,4<5,5<5\\false (jump to next for)
				  //k=2 2<5,3<5,4<5,5<5\\false
				  //k=3 3<5,4<5,5<5\\false
				  //k=4 4<5,5<5\\false
				 //k=5 5<5\\false (no space will be allocated)
				//1 space --> Equilateral angle triangle
				//2 space --> Left Angled triangle
				System.out.print("  ");	
			}
			for(int j=1;j<=i;j++) {
				     // 1<=1
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=1;i<=a;i++) {
			for (int k=1;k<i;k++) {
				System.out.print("  ");
			}
			for (int j=i;j<=a;j++) {
				System.out.print("* ");
			}
			System.out.println();
		
         mu.close();

	}
	}
}
