package guviprgrms;

import java.util.Scanner;

public class Sumbeginner {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		for( int i=1;i<=n;i++){
			sum=i+sum;
		}
		System.out.println(sum);
	}

}
