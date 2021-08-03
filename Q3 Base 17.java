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
        int j=0;
        int val=0;
        for(int i=num.length()-1;i>=0;i--){
            if(Character.isDigit(num.charAt(i))){
               val+=Character.getNumericValue(num.charAt(i))*Math.pow(17,j++); 
            }
            else{
                int temp = num.charAt(i)-55;
                val+=temp*Math.pow(17,j++);
            }
        }
        System.out.println(val);
	}
}
