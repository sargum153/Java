package ConstructorAndSetter;

public class StudentInfo {
	private int sno;
	private String sname;
	private String course;
	private double fee;
	
	public StudentInfo() {
		//System.out.println("Stident object is initialized by using non para constructor");
	}
	
	public StudentInfo(int sno, String sname, String course, double fee) {
		this.sno = sno;
		this.sname= sname;
		this.course = course;
		this.fee = fee;
		//System.out.println("Student object is initialized by using para constructor");
	}
	
	public void setSno(int sno) {
		this.sno = sno;
	}
	public int getSno() {
		return sno;
	}
	
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSname() {
		return sname;
	}
	
	public void setCourse(String course) {
		this.course = course;
	}
	public String getCourse() {
		return course;
	}
	
	public void setFee(double fee) {
		this.fee = fee;
	}
	public double getFee() {
		return fee;
	}
	
	public void display() {
		System.out.println("Student Serial number\t: " + sno);
		System.out.println("Student Name\t\t: " + sname);
		System.out.println("Course\t\t\t: " + course);
		System.out.println("Fee\t\t\t: " + fee);
		
		
	}
	
}
