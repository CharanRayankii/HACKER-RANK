package Day1;

import java.util.Scanner;

/* write a program to print the following pattern


  ******
  ******
  ******
  ******
     
     
     
 */

public class Squarehallow {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner (System.in);
		int m=scan.nextInt();
		int n=scan.nextInt();
		printPattern(m, n);
	}
	public static void printPattern(int m,int n)
	{
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	

}
