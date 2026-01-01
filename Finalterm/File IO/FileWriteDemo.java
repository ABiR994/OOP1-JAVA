import java.io.*;

public class FileWriteDemo {
    public static void main(String[] args) {

        try {
            FileWriter fw = new FileWriter("data.txt");
            fw.write("Hello Java File Handling\n");
            fw.write("This is file write example\n");
            fw.write("End of file.");
            fw.close();

            System.out.println("File written successfully");
        } 
		catch (IOException e) {
            System.out.println("File write error");
        }
    }
}