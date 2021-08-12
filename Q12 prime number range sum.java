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
		int sum=0;
		for(int i=1;i<t;i++){
		    if(isPrime(i)){
		        sum+=i;
		        //System.out.println(i);
		    }
		    
		}
		System.out.println("Result=> "+sum);
	}
	public static boolean isPrime(int n){
	    if(n<2){
	        return false;
	    }
	    if(n==2){
	        return true;
	    }
	    for(int i=2;i<=n/2;i++){
	        if(n%i==0){
	            return false;
	        }
	    }
	    return true;
	}
	
}
