import java.util.Scanner;
public class StudentManagement {
    public static void main(String[] args) {
        Student[] students = new Student[5];
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0; i < students.length; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            
            System.out.print("Enter name: ");
            String name = sc.nextLine();
            
            System.out.print("Enter age: ");
            int age = sc.nextInt();
            
            System.out.print("Enter id: ");
            int id = sc.nextInt();
            
            System.out.print("Enter cgpa: ");
            double cgpa = sc.nextDouble();
            
            sc.nextLine();
            
            students[i] = new Student(name, age, id, cgpa);
        }
        sc.close();
        
        for(int i = 0; i < students.length; i++) {
            students[i].displayInfo();
        }
    }
}
