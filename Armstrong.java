package guviprgrms;

import java.util.Scanner;

public class Armstrong {

	
	public static void main(String[] args) {
		int sum=0;
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int a1=a;
		while(a>0){
		int r=a%10;
		sum=sum+(r*r*r);
		a=a/10;
	}
		if(a1==sum){
			System.out.println("Armstrong");
		}
		else
		{
			System.out.println("Not Armstrong");
		}
	}

}
