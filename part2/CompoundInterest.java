package part2;

public class CompoundInterest implements Strategy {

    @Override
    public double calculateInterest(double balance, double rate) {
        return balance * Math.pow((1 + rate / 365), 31) - balance;
    }
}
