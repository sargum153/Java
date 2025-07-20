// Develop a program to create the RWO Employee in programming world Create Employee object
// with the properties eno, ename, sal, dept.

// Provide access to above properties for read and modifying
// their values only via setter and getter methods
//Initialize the above properties via setter methods,
// Display the above properties via display method.
//Increase the salary of an employee by 20%
//Display update Salary of this employee



package Method;

public class Employee {
	int eno;
	String ename;
	double sal;
	String dept;
	
	
	void setEno(int eno) {
		this.eno = eno;
	}
	int getEno() {
		return eno;
	}
	
	void setEname(String ename) {
		this.ename = ename;
	}
	String getEname() {
		return ename;
	}
	
	void setSal(double sal) {
		this.sal = sal;
	}
	double getSal() {
		return sal;
	}
	
	void setDept(String dept) {
		this.dept = dept;
	}
	String getDept() {
		return dept;
	}
	
	void display() {
		System.out.println("Eno: " + eno + " " + ename + " " + sal + " " + dept);
	}
}
