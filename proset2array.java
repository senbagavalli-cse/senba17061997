package guviprgrms;
	import java.util.Arrays;
	import java.util.Scanner;
	public class proset2array {
	
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the size of array");
			int a=sc.nextInt();
			float s[]=new float[a];
			System.out.println("Enter the number of elements in array");
			for(int i=0;i<a;i++){
			s[i]=sc.nextFloat();
			}
			Arrays.sort(s);
			System.out.println("Sorted array");
			for(int i=s.length-1;i>=0;i--)
			{
				System.out.println(s[i]);
			}
			sc.close();
		}
	}