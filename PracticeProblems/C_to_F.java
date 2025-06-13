import java.util.*;
public class C_to_F
{
	public static void  main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter temperature in Celsius:");
		float Celsius = sc.nextFloat();
		float Fahrenheit = (float)(Celsius * 9/5) + 32;
		System.out.print(Fahrenheit);
		sc.close();
	}
}