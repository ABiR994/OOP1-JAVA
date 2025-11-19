public class FullTimeEmployee extends Employee {
	private double festival_bonus;
	
	FullTimeEmployee(String name, double salary, int age, double festival_bonus) {
		super(name, salary, age);
		this.festival_bonus = festival_bonus;
	}
	
	void setFestivalBonus(double festival_bonus) {
		this.festival_bonus = festival_bonus;
	}
	
	double getFestivalBonus() {
		return festival_bonus;
	}
	
	void displayFTEmp() {
		System.out.println("\nFor full-time employees: ");
		super.displayEmp();
		System.out.println("Festival Bonus: " + festival_bonus);
	}
}