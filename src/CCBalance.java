public class CCBalance {
    static void main() {
        double balance = 5000;
        final double RATE = .17;

        // balance = balance + interest // interest = balance * RATE
        balance = balance + balance * RATE;

        IO.println("Your balance after 1 month is " + balance);
        balance = balance + balance * RATE;
        IO.println("Your balance after 2 months is " + balance);
    }
}
