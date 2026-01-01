package Entity;

public class Student {
    private String id;
    private String name;
    private double cgpa;

    public Student() {}

    public Student(String id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

   
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getCgpa() { return cgpa; }
    public void setCgpa(double cgpa) { this.cgpa = cgpa; }

    public void showStudent() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + cgpa);
    }

   
    public String getStudentInfo() {
        return "ID: " + id + ", Name: " + name + ", CGPA: " + cgpa;
    }
}
