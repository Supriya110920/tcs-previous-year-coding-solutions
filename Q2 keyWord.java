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
        String []key = {"break", "case", "continue", "default", "defer", "else", "for", "func", 
        "goto", "if", "map", "range", "return", "struct", "type", "var"};
        String str = sc.next();
        int flag=0;
        for(int i=0;i<key.length;i++){
            if(str.equals(key[i])){
                flag=1;
                break;
            }
        }
        if(flag==1){
            System.out.println(str+" is a keyword");
        }
        else{
            System.out.println(str+" is not a keyword");
        }
	}
}
