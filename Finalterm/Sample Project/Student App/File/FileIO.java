package File;

import Entity.*;
import java.io.*;
import java.util.*;

public class FileIO {

    public static void loadFromFile(Student[] students) {
        try {
            Scanner sc = new Scanner(new File("./File/Students.txt"));
            int idx = 0;
            while (sc.hasNextLine() && idx < students.length) {
                String data[] = sc.nextLine().split(";");
                students[idx++] = new Student(data[0], data[1], Double.parseDouble(data[2]));
            }
            sc.close();
        } catch (Exception e) {
            System.out.println("Load Error: " + e.getMessage());
        }
    }

    public static void saveChangesInFile(Student[] students) {
        try {
            FileWriter writer = new FileWriter(new File("./File/Students.txt"));
            for (Student s : students) {
                if (s != null) {
                    writer.write(s.getId() + ";" + s.getName() + ";" + s.getCgpa() + "\n");
                }
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("Save Error: " + e.getMessage());
        }
    }
}
