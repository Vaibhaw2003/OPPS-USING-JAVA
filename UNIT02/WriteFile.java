import java.io.*;

public class WriteFile {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("test.txt");
            fw.write("Hello Java!");
            fw.close();
        } catch (IOException e) {
            System.out.println("Writing error.");
        }
    }
}
