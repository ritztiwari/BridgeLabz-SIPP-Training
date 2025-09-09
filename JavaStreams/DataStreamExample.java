import java.io.*;

public class DataStreamExample {
    public static void main(String[] args) {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("students.dat"))) {
            dos.writeInt(1);
            dos.writeUTF("Ravi");
            dos.writeDouble(8.5);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (DataInputStream dis = new DataInputStream(new FileInputStream("students.dat"))) {
            int roll = dis.readInt();
            String name = dis.readUTF();
            double gpa = dis.readDouble();
            System.out.println(roll + " " + name + " " + gpa);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
