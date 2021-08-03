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
        String num = sc.next();
        int odd=0;
        int even=0;
        for(int i=0;i<num.length();i++){
            if(i%2==0){
                even+=Character.getNumericValue(num.charAt(i));
            }
            else{
                odd+=Character.getNumericValue(num.charAt(i)); 
            }
        }
        System.out.println(Math.abs(odd-even));
        
        
	}
}
