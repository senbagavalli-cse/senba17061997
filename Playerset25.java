package guviprgrms;

import java.util.Scanner;

public class Playerset25 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        for(int i=0;i<n;i++)
        {
        	a[i]=sc.nextInt();
        }
	
	int k=sc.nextInt();
for( int i=n-k;i<n;i++){
	b[i]=a[i];
	System.out.println(b[i]);
}
for( int i=0;i<n-k;i++){
	b[i]=a[i];
}
for(int i=0; i<n-k;i++)
	System.out.println(b[i]);
}
}