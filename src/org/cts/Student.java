package org.cts;

public class Student {
	private void studentDetails() {
		 System.out.println("students details ");
	}
	// differ data type
	private void studentDetails(int rollnumber) {
		 System.out.println("student rollnumber:"+rollnumber);
	}
	private void studentDetails(String name ) {
		 System.out.println("student name:"+name);
	}
	
	 // differ by data type count 
	private void studentDetails(int age,String name) {
		 System.out.println("student age:"+age+"\n"+"student name:"+name);
	}
	private void studentDetails(float weight,char gender) {
		 System.out.println("student weight:"+weight+"\n"+"student gender:"+gender);
	}
	
 public static void main(String[] args) {
	 Student s = new Student();
	 s.studentDetails(526532);
	 s.studentDetails("appu");
	 s.studentDetails(24, "appu");
	 s.studentDetails(52.0f, 'm');
	}
 // differ by data type  
}
