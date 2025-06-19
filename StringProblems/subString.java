import java.util.Scanner;
public class subString {
    public static String createSubString(String str,int start,int end){
        if(start>end){
            throw new IllegalArgumentException("starting index is greator than ending index");
        }

        StringBuffer str1 = new StringBuffer();

        for(int i=start;i<end;i++){
            str1.append(str.charAt(i));
        }

        return str1.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string:");
        String str = sc.nextLine();
        System.out.println("enter start index");
        int start = sc.nextInt();
        System.out.println("enter ending index");
        int end = sc.nextInt();
        String inBuildSubStringMethod = str.substring(start, end);

        String userCreatedSubString = createSubString(str,start,end);
        if(inBuildSubStringMethod.equals(userCreatedSubString)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

        System.out.printf("In built substring method: %s \n",inBuildSubStringMethod);
        System.out.printf("User defined substring method: %s \n",userCreatedSubString);

        sc.close();
    }
}
