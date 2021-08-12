/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		System.out.print("0 1 ");
		int n1=0;
		int n2=1;
		for(int i=2;i<t;i++){
		    int res=n1+n2;
		    System.out.print(res+" ");
		    n1=n2;
		    n2=res;
		}
	}
}
