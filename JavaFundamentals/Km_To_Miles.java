import java.util.Scanner;

public class Km_To_Miles{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance in kilometers: ");
        double kilometers = sc.nextDouble();
        double miles = kilometers * 0.621371;
        System.out.println("The total miles is " + miles + " mile for the given " + kilometers + " km");
        sc.close();
    }
}