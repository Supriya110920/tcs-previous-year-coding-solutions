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
// 		int t= sc.nextInt();
// 		for(int i=0;i<t;i++){
		    
// 		}
        String str = sc.next();
        long x = Long.parseLong(str,2);
        System.out.println("Binary to Decimal==> "+x);
        String xs = Long.toBinaryString(x);
        System.out.println("Decimal to Binary==> "+xs);
        System.out.printf("Decimal to Octal==> %o",x);
        System.out.printf("\nDecimla to hexa==> %x",x);
        
        
	}
}
