package part2;

public class StrategyTest {

    public static void main (String [] args){

        Context context = new Context(new SimpleInterest());
        System.out.println("Using Simple Interest\n"+context.executeStrategy(100000,0.2));

        context = new Context(new CompoundInterest());
        System.out.println("Using Compound Interest\n"+context.executeStrategy(100000,0.2));
    }
}
