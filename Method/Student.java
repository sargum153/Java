package Method;

public class Student {
	int sno;
	String sname;
	
	void setSno(int sno) {
		this.sno = sno;
	}
	
	int getSno() {
		return this.sno;
	}
	
	
	void setSname(String sname) {
		this.sname = sname;
	}
	
	String getSname() {
		return this.sname;
	}
	
	void display(){
		System.out.println(sno + " " + sname);
	}
}
