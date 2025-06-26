public class HandshakeCalculator {
    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        System.out.println("Handshakes: " + calculateHandshakes(5));
    }
}
