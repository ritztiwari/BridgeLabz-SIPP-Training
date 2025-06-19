import java.util.Scanner;

public class illegalException {
    public static void checkAge(String str,int n,int m) {
        if (n > m) {
            throw new IllegalArgumentException("starting index can't be greator than ending index");
        }
        System.out.println(str.substring(n,m));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("enter starting index:");
        int n = sc.nextInt();
        System.out.println("enter ending index:");
        int m = sc.nextInt();

        try {
            System.out.println("Checking age...");
            checkAge(str,n,m);  // Invalid input: triggers exception
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        }
        sc.close();
    }
}
