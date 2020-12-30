package demo;

import jaxb.EmployeeJAXB;

public class Main {
	public static void main(String[] args) {
		EmployeeJAXB obj=new EmployeeJAXB();
		obj.marshall();
		obj.unmarshall();
	}
}