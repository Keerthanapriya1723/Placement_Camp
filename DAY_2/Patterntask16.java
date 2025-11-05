package DAY_2;

public class Patterntask16 {
	
	     //Even star
/*
 *       * 
       * * * 
     * * * * * 
   * * * * * * * 
 * * * * * * * * * 
   * * * * * * * 
     * * * * * 
       * * * 
         * 	
 */
	

	public static void main(String[] args) {
		int a=10;

		for(int i=1;i<=a;i++)

		{

			if(i%2==0)

			{

				continue;

			}

			for(int k=i;k<a;k++)

			{

				System.out.print(" "); //2 space gets left angle triangle ,1 space gets triangle

			}

			for(int j=1;j<=i;j++)

			{

				System.out.print("* ");

			}

		System.out.println();}

	   

		for(int i=8;i>=1;i--) {

			if(i%2==0)

			{

				continue;

			}

			for(int k=i;k<a;k++) {

				System.out.print(" ");

			}

			for(int j=i;j>=1;j--) {

				System.out.print("* ");

			}

		System.out.println();}
	}

}
