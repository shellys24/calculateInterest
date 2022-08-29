package part2;

public class SimpleInterest implements Strategy {
    @Override
    public double calculateInterest(double balance, double rate) {
        return balance * rate / 12.0;
    }
}
