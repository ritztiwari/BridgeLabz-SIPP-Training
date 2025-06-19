import java.util.Scanner;

public class arrayOutOfBound {

    public static void generateException(String[] names) {
        System.out.println("\nGenerating Exception:");
        System.out.println("Accessing index 10: " + names[10]);
    }

    public static void handleException(String[] names) {
        System.out.println("\nHandling Exception:");
        try {
            System.out.println("Accessing index 10: " + names[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught generic RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of names: ");
        int size = sc.nextInt();
        sc.nextLine();

        String[] names = new String[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = sc.nextLine();
        }

        try {
            generateException(names);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }

        handleException(names);
        sc.close();
    }
}
