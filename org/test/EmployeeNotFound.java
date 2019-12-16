package org.test;

public class EmployeeNotFound  extends Exception{
	@Override
	public String getMessage() {
		String s="Eployee not found in unit1";
		return s;
	}

}
