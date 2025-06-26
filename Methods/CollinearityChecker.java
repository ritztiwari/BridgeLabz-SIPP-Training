public class CollinearityChecker {
    public static boolean isCollinearSlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        return (y2 - y1) * (x3 - x2) == (y3 - y2) * (x2 - x1);
    }

    public static boolean isCollinearArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        return (x1*(y2 - y3) + x2*(y3 - y1) + x3*(y1 - y2)) == 0;
    }

    public static void main(String[] args) {
        System.out.println("Slope method: " + isCollinearSlope(2, 4, 4, 6, 6, 8));
        System.out.println("Area method: " + isCollinearArea(2, 4, 4, 6, 6, 8));
    }
}
