package guviprgrms;

import java.util.Scanner;

public class Proset22 {


		private static final String Stringmid = null;

		public static String main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        String str;
	        System.out.println("enter the value=\n");
	        
	        str=sc.nextLine();
	     if (str.length() <= 1) return str;
	  
	  String mid = str.substring(1, str.length()-1);
	  System.out.println(" the value are =\n" +Stringmid);
	  
	  return str.charAt(str.length()-1) + mid + str.charAt(0);
	       
	}
	}

