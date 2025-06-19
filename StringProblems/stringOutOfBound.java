import java.util.Scanner;

public class stringOutOfBound {
    public static void generateException(String str, int index) {
        System.out.println("Generating Exception\n");
        System.out.printf("Trying to access index %d in string: %c\n", index, str.charAt(index));
    }

    public static void checkString(String str, int index) {
        try {
            System.out.println("Accessing in try block: " + str.charAt(index));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.print("Enter index to access: ");
        int index = sc.nextInt();

        try {
            generateException(str, index);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught Exception in main: " + e.getMessage());
        }

        checkString(str, index);
        sc.close();
    }
}
