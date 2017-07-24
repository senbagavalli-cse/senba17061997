package guviprgrms;

import java.util.Scanner;

public class Begineerswap {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("before swap");
	int a=sc.nextInt();
	int b=sc.nextInt();
	System.out.println("aftr swap");
	int temp=a;
	a=b;
	b=temp;
	System.out.println(a);
	System.out.println(b);

	}

}
