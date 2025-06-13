import java.util.Scanner;

public class Harry_age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Harry_Birth = 2000;
        int current_year = 2024;
        int age = current_year-Harry_Birth;
        System.out.println("Harry's age in 2024 is "+age);
        sc.close();
    }
}