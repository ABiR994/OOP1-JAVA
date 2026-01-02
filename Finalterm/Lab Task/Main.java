public class Main {
	public static void main(String[] args) {
		Teacher t1 = new Teacher("John Doe", 28, 50000);
		Administrator a1 = new Administrator("Alice Smith", 35, 80000);
		Student s1 = new Student("Alex", 21, 98.0);

		Staff.displaySchool();

		Staff[] staff = new Staff[] {t1, a1};

		staff[0].calculateSalary();
		staff[1].calculateSalary();

		System.out.println(t1);
		System.out.println(a1);

		t1.evaluateExam(s1);
	}
}