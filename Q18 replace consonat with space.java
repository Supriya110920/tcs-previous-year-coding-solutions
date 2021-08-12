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
		String str= sc.next();
		for(int i=0;i<str.length();i++){
		    if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' ||
		    str.charAt(i)=='o' || str.charAt(i)=='u' ){
		        System.out.print(str.charAt(i));
		    }
		    else{
		        System.out.print(" ");
		    }
		}
	}
}
