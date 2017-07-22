package guviprgrms;

import java.util.Scanner;

public class Prime {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i, flag=0;
		
		  for(i=2;i<=n/2;++i)
		  {
		      if(n%i==0)
		      {
		          flag=1;
		          break;
		      }
		  }
		  if (flag==0)
		      System.out.println("prime");
		  else
		      System.out.println("not prime");
		}

}
