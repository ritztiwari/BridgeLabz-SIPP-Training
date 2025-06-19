import java.util.Scanner;
public class toLowerCase{
    public static String lowerCase(String str){
        StringBuffer lower = new StringBuffer();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch >= 'A' && ch<='Z' ){
                ch = (char)(ch+32);
            }
            lower.append(ch);
        }
        return lower.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //taking input from user of string.
        String str = sc.nextLine();
        // using in built method toLowerCase to generate a lower case string.
        String str1 = str.toLowerCase();
        sc.close();

        //user defined method call and storing it into the string.
        String afterconversion = lowerCase(str);
        if(afterconversion.equals(str1)){
            System.out.println("both string are equal");
        }else{
            System.out.println("both string are not equal");
        }

        System.out.printf("In-built method conversion: %s \n",str1);
        System.out.printf("manual method convresion: %s \n",afterconversion);

    }
}