package org.test;

import java.io.EOFException;
import java.io.IOException;

public class Saple {
	
		
	
	public static void main(String[] args)  {
		try {
		int value=10/0;
		throw new IOException();}
		
		
		
	
		catch (EOFException e) {
			
			System.out.println("2");
		}
		
		catch(ArithmeticException e ){
			System.out.println("3");}
		catch(NullPointerException e) {
		
	
		System.out.println("4");
	

}catch(IOException e) {
	System.out.println("6");
}
		catch(Exception e) {
			System.out.println("7");
			
		}
		
}
}
