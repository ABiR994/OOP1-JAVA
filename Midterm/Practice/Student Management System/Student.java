public class Student extends Person {
    private int id;
    private double cgpa;
    
    Student() {
        super();
        this.id = 0;
        this.cgpa = 0.0;
    }
    
    Student(String name, int age, int id, double cgpa) {
        super(name, age);
        this.id = id;
        this.cgpa = cgpa;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }
    
    public int getId() {
        return this.id;
    }
    
    public double getCgpa() {
        return this.cgpa;
    }
    
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Id: " + this.id);
        System.out.println("Cgpa: " + this.cgpa);
    }
}
