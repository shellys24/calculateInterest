package part2;

public class Context {
    private final Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public double executeStrategy(double balance, double rate) {
        return strategy.calculateInterest(balance, rate);
    }
}