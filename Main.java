
import strategyPattern.*;

public class Main {

    public static void main(String[] args) {
        StrategyPattern client1 = new StrategyPattern(new StrategyA());
        StrategyPattern client2 = new StrategyPattern(new StrategyB());

        client1.getStrategy().run();
        client2.getStrategy().run();
    }
}
