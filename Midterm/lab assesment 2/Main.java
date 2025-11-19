public class Main {
	public static void main(String[] args) {
		Employee emp1 = new Employee("Opu", 20000.0, 20);
		emp1.displayEmp();
		
		FullTimeEmployee ftemp1 = new FullTimeEmployee("Nobel", 30000.0, 21, 7530.50);
		ftemp1.displayFTEmp();
	}
}