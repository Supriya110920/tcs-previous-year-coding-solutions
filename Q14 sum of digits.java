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
		long t= sc.nextLong();
		long sum=0;
		while(t>0){
		    long temp = t%10;
		    t=t/10;
		    sum+=temp;
		    
		}
		System.out.println("Sum==> "+sum);
		
	}
}
