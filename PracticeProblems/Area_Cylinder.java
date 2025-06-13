import java.util.Scanner;
public class Area_Cylinder
{
	public static void  main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter radius");
		float radius = sc.nextFloat();
		System.out.println("enter height");
		float height = sc.nextFloat();
		float area = (float)(3.14*radius*radius*height);
		System.out.print("area of cylinder is: ");
		System.out.print(area);
		sc.close();
		}
}