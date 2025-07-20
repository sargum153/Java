package Method;

public class Company {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		
		e1.setEno(101);
		e1.setEname("Sargum");
		e1.setSal(40000);
		e1.setDept("Java Developer");
		
		e1.display();
		
		double oldSal = e1.getSal();
		
		double newSal = oldSal + oldSal * 20/100;
		e1.setSal(newSal);
		e1.display();
	}
}
