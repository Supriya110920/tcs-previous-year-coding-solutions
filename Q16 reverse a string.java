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
		String t= sc.next();
		String res="";
		for(int i=t.length()-1;i>=0;i--){
		    res+=t.charAt(i);
		}
		System.out.println(res);
	}
}
