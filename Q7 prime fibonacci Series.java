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
// 		for(int i=0;i<t;i++){
// 		    int n =sc.nextInt();
		    
// 		}
        if(t==1){
            System.out.println(1);
        }
        else if(t==1){
            System.out.println(2);
        }
        else if(t==3){
            System.out.println(1);
        }
        else{
            if(t%2!=0){
                t=t/2;
                System.out.println(fibonacci(t+1));
            }
            else{
                System.out.println(prime(t/2));
            }
        }


	}
// 	public static long fibonacci(int n){
// 	    long x1=0;
// 	    long x2=1;
// 	    long res=0;
// 	    for(int i=1;i<n;i++){
// 	        res=x1+x2;
// 	        x1=x2;
// 	        x2=res;
// 	    }
// 	    return res;
// 	}
    public static int fibonacci(int num){
        if(num<=1){
            return num;
        }
        return fibonacci(num-1)+fibonacci(num-2);
    }
    
	public static int prime(int n){
	    int flag=0;
	    int x=1;
	    int count=0;
	    int j=0;
	    while(count<n){
	        x=x+1;
	        flag=0;
	        for(j=2;j<=x/2;j++){
	            if(x%j==0){
	                flag=1;
	                break;
	            }
	        }
	        if(flag==0){
	            count++;
	        }
	    }
	    return x; 
	    
	}
}
