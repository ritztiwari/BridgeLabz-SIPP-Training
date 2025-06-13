import java.util.*;
public class Simple_Interest
{
	public static void  main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the principle amount:");
		int principle = sc.nextInt();
		System.out.println("enter the time in years:");
		int time = sc.nextInt();
		System.out.println("enter rate:");
		float rate = sc.nextFloat();
		float volume = (principle * rate * time)/100;
		System.out.print(volume);
		sc.close();
	}
}