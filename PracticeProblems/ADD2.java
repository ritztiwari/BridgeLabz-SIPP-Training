import java.util.Scanner;
public class ADD2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter integer 1:");
		int n = sc.nextInt();
		System.out.println("enter integer 2:");
		int m = sc.nextInt();
		System.out.print(n+m);
		sc.close();
	}
}