package guviprgrms;

import java.util.Scanner;

public class positive {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if(a==0){
			System.out.println("zero");
		}
		else if(a>=0){
			System.out.println("positive");
		}
		else{
			System.out.println("negative");
		}
		

	}

}
