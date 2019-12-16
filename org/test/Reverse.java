package org.test;

public class Reverse {
	public static void main(String[] args) {
		
		
		
		
		for(int n=1;n<100;n++) {
			int a;
			a=n;
		int i=0;
		int j=0;
		
		while(a>0) {
			i=a%10;
			j=j+(i*i*i);
			a=a/10;
			
		
		
		if( n==j) {
			System.out.println(n);
			
		}
		}
	
		}
}
}



