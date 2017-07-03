package guviprgrms;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		int sum=0;
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int a1=a;
while(a!=0){
	int r=a%10;
	sum=(sum*10)+r;
	a=a/10;
}
if(a1==sum){
System.out.println("palindrome");
}
else
{
	System.out.println("Not a palindrome");}
	}

}

