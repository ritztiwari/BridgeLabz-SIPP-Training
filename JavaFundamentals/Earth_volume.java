import java.util.Scanner;
public class Earth_volume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = 6378;
        double kmToMiles = 0.621371;
        double km_cube = (4.0/3.0) * Math.PI * Math.pow(r,3);

        double cubic_miles = km_cube * Math.pow(kmToMiles,3);
        System.out.printf("The volume of earth in cubic kilometers is %.2f and cubic miles is %.2f\r",km_cube,cubic_miles);
        sc.close();
    }
}
