package Day1;

import java.util.Scanner;

/* number triangle 
   
   
   
  	 1
  	2 2 
   3 3 3
  4 4 4 4
   
   	
   	
 */
public class NumberTriangle {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int m=scan.nextInt();
		int n=scan.nextInt();
		printPattern(m,n);
	}
	public static void printPattern(int m,int n) {
		
		for(int i=1;i<=m;i++)
		{
			for(int j=0;j<n-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
			
		}
	}
	

}
