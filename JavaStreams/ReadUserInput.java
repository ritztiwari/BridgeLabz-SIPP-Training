import java.io.*;

public class ReadUserInput {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             FileWriter fw = new FileWriter("userdata.txt")) {
            System.out.print("Enter name: ");
            String name = br.readLine();
            System.out.print("Enter age: ");
            String age = br.readLine();
            System.out.print("Enter favorite language: ");
            String lang = br.readLine();
            fw.write("Name: " + name + "\nAge: " + age + "\nLanguage: " + lang);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
