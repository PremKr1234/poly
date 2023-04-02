package org.emp;

public class EmployeeDetails {
public void empId(String name) {
	System.out.println("Your Name is: " +name);
}
public void empId(int Id) {
	System.out.println("Your Id is: " +Id);
}
public void empId(char domain) {
	System.out.println("Your Domain is: "+domain);
	
}
public void empId(float sal) {
	System.out.println("Your Salary is: "+sal);
}
public void empId(boolean ms) {
	System.out.println("Your Marriage Status is: "+ms);
}
public static void main(String[] args) {
	EmployeeDetails e=new EmployeeDetails();
	e.empId("Prem Kannan");
	e.empId(336879);
	e.empId('T');
	e.empId(75638.32764f);
	e.empId(false);
}

}
