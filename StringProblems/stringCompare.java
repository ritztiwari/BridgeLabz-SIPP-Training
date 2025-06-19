import java.util.Scanner;

public class stringCompare {
    public static boolean checkEqual(String str,String str1){
        int m;
        if(str.length() >= str1.length()) {
            m = str.length();
        }else{
            m = str1.length();
        }
        for(int i=0;i<m;i++){
            char ch = str.charAt(i);
            char ch1 = str.charAt(i);
            if(ch != ch1){
                return false;
            }

        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string 1:");
        String str = sc.nextLine();
        System.out.println("enter string 2:");
        String str1 = sc.nextLine();

        boolean check = checkEqual(str,str1);
        boolean checkInBuiltMethod = str.equals(str1);

        if(check == checkInBuiltMethod){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

        sc.close();
    }
}
