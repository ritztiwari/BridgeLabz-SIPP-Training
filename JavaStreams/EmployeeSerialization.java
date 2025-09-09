import java.io.*;
import java.util.*;

class Employee implements Serializable {
    int id;
    String name;
    String department;
    double salary;
    Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
    public String toString() {
        return id + " " + name + " " + department + " " + salary;
    }
}

public class EmployeeSerialization {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1, "Alice", "HR", 50000));
        list.add(new Employee(2, "Bob", "IT", 60000));
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employees.dat"))) {
            oos.writeObject(list);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("employees.dat"))) {
            List<Employee> emps = (List<Employee>) ois.readObject();
            for (Employee e : emps) System.out.println(e);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
