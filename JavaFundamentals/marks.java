import java.util.Scanner;

public class marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maths = 94;
        int physics = 95;
        int chemistry = 96;
        int total_marks = maths + physics + chemistry;
        float average_marks = (float)(total_marks)/3;
        System.out.println("Sam's average marks is "+ average_marks);
        sc.close();
    }
}

