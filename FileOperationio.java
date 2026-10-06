import java.io.*;

public class FileOperationio{
    public static void main(String[] args) throws IOException {
 File file = new File("student.txt");

        file.createNewFile();

        FileOutputStream out = new FileOutputStream(file);
        String data = "Name: Vedadri\nCourse: Computer Science";
        out.write(data.getBytes());
        out.close();

        FileInputStream in = new FileInputStream(file);
        int ch;

        while ((ch = in.read()) != -1) {
            System.out.print((char) ch);
        }

        in.close();
    }
}