import java.util.Scanner;

public class customLength {
    public static int findLength(String str){
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string:");
        String str = sc.nextLine();

        int userDefinedLength = findLength(str);
        int inBuildLengthMethod = str.length();

        if(userDefinedLength == inBuildLengthMethod){ 
            System.out.println("user defined method returns length:"+userDefinedLength);
            System.out.println(true);
        }else{
            System.out.println(false);
        }
        sc.close();
    }
}
