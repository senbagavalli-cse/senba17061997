package guviprgrms;

import java.util.Scanner;

public class proset21 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=a;
		while(a!=0){
			int s=a%10;
			a=a/10;
			b=b*s;
			
		}
		System.out.println(b);
		
	}

}
