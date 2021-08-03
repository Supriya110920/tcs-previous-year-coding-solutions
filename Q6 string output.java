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
		sc.nextLine();
		for(int j=0;j<t;j++){
		    String w1 = sc.next();
		    String w2 = sc.next();
		    String w3 = sc.next();
		    for(int i=0;i<w1.length();i++){
		        if(w1.charAt(i)=='a' || w1.charAt(i)=='e' || w1.charAt(i)=='i' || 
		        w1.charAt(i)=='o' || w1.charAt(i)=='u' || w1.charAt(i)=='A' || w1.charAt(i)=='E' ||
		        w1.charAt(i)=='I' || w1.charAt(i)=='O' || w1.charAt(i)=='U'){
		            w1=w1.replace(Character.toString(w1.charAt(i)),"$");
		            //System.out.println("lol");
		        }
		        //System.out.println("lol2");
		    }
		    for(int i=0;i<w2.length();i++){
		        if(w2.charAt(i)!='a' && w2.charAt(i)!='e' && w2.charAt(i)!='i' && 
		        w2.charAt(i)!='o' && w2.charAt(i)!='u' && w2.charAt(i)!='A' && w2.charAt(i)!='E' &&
		        w2.charAt(i)!='I' && w2.charAt(i)!='O' && w2.charAt(i)!='U'){
		            w2=w2.replace(Character.toString(w2.charAt(i)),"#");
		            //System.out.println("lol");
		        }
		        //System.out.println("lol2");
		    }
		    w3=w3.toUpperCase();
		    System.out.println(w1+w2+w3);
		    
		}
	}
}
