package occurenceCount;
import java.util.StringTokenizer;

import java.util.Scanner;
import java.text.ParseException;
public class UserMainCode {
	 public static int countWords(String s1, String s2) {
	        
	       StringTokenizer t=new StringTokenizer(s1," ");
	       int c=0;
	       while(t.hasMoreTokens()){
	           String s3=t.nextToken();
	           if(s3.equals(s2))
	           c++;
	       }
	       return c;
	    
	    }
}

class Main {
	 public static void main(String args[])throws ParseException {
	        Scanner sc=new Scanner(System.in);
	    	String str1=sc.nextLine();
	    	String str2=sc.next();
	    	int b=UserMainCode.countWords(str1,str2);
	    	System.out.println(b);
	      
	    }
}

