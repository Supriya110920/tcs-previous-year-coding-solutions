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
		for(int i=0;i<t;i++){
		    int n = sc.nextInt();
		    if(((n%4==0)&&(n%100!=0))||n%400==0){
		        System.out.println("Leap Year");
		    }
		    else{
		        System.out.println("non Leap yaer");
		    }
		    
		}
	}
}
