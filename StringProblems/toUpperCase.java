import java.util.Scanner;
public class toUpperCase{
    public static String upperCase(String str){
        StringBuffer lower = new StringBuffer();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch >= 'a' && ch<='z' ){
                ch = (char)(ch-32);
            }
            lower.append(ch);
        }
        return lower.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //taking input from user of string.
        String str = sc.nextLine();
        // using in built method toUpperCase to generate a upper case string.
        String str1 = str.toUpperCase();
        sc.close();

        //user defined method call and storing it into the string.
        String afterconversion = upperCase(str);
        if(afterconversion.equals(str1)){
            System.out.println("both string are equal");
        }else{
            System.out.println("both string are not equal");
        }

        System.out.printf("In-built method conversion: %s \n",str1);
        System.out.printf("manual method convresion: %s \n",afterconversion);

    }
}