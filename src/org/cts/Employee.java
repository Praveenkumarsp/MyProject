package org.cts;

public class Employee {
	private void employeeDetails() {
		 System.out.println("employee details");
	}
	// differ data type
	private void employeeDetails(String name) {
		 System.out.println("employee name:"+name);
	}
	private void employeeDetails(int age) {
		 System.out.println("employee age:"+age);
	}
	// differ by datatype count
	private void employeeDetails(long phone,int pin) {
		 System.out.println("employee phone:"+phone+"\n"+"employee pin:"+pin);
	}
	private void employeeDetails(int birthyear,long joinyear,char gender) {
		 System.out.println("employee birthyear:"+birthyear+"\n"+"employee joinyear:"+joinyear+"\n"+"employee gender:"+gender);
	}
	//// differ by datatype order
	private void employeeDetails(String email,float salary) {
		 System.out.println("employee email:"+email+"\n"+"employee salary:"+salary);
	}
	private void employeeDetails(float weight,String adderess) {
		 System.out.println("employee weight:"+weight+"\n"+"employee adderess:"+adderess);
	}
	public static void main(String[] args) {
		Employee e = new Employee();
		e.employeeDetails( "praveen");
		e.employeeDetails(24);
		e.employeeDetails(9791167478l, 600978);
		e.employeeDetails(1666, 2022, 'm');
		e.employeeDetails("ee@123", 800.50f);
		e.employeeDetails(50.5f, "chennai");
		
	}
}
