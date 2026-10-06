import java.io.*;

public class FileOperation {
    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter("student.txt");

        fw.write("Name: Vedadri\n");
        fw.write("Course: Computer Science\n");

        fw.close();

        FileReader fr = new FileReader("student.txt");

        int ch;
        while ((ch = fr.read()) != -1) {
            System.out.print((char) ch);
        }

        fr.close();
    }
}