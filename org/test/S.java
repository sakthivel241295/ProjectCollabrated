package org.test;

import java.util.Scanner;

public class S {public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the num");
	int d=s.nextInt();
//	int count=1;
//	
//	for(int i=1;i<=d;i++)
//	{
//		
//		count=count*i;
//		
//	}
//	System.out.println(count);
	int a=0;
	int b=1;
	
	System.out.println(a);
	System.out.println(b);
	for( int i=2;i<=d;i++) {
		int c=a+b;
		System.out.println(c);
		a=b;
		b=c;
		
	}


}
}