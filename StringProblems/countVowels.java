import java.util.Scanner;
public class countVowels {
    public static int[] countVowelsConsonants(String str){
        int[] arr = new int[2];
        int vowels = 0;
        int consonanats = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
                vowels+=1;
            }else{
                consonanats+=1;
            }
        }
        arr[0] = vowels;
        arr[1] = consonanats;
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string to find vowels & consonants:");
        String str = sc.nextLine();

        int[] arr = countVowelsConsonants(str);
        System.out.printf("no. of vowels is: %d \n",arr[0]);
        System.out.printf("no. of consonants is: %d \n",arr[1]);
        sc.close();
    }
}