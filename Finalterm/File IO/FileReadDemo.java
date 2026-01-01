import java.io.*;
import java.util.Scanner;

public class FileReadDemo {
    public static void main(String[] args) {

        try {
            File file = new File("data.txt");
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }

            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}