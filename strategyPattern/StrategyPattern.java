package strategyPattern;

/**
*   <p>
*       A simple class witch can use either one family member of the Strategy 
*       algorthms of which a client using it decided to use.
*       Basic intro to Strategy Design Pattern.
*   </p>
*
*   @Author: KatlegoM
*   Date: 20221508
*/
public class StrategyPattern {
    private Strategy strategy;

    public StrategyPattern(Strategy strategy) {
        setStrategy(strategy);
    }

    public void setStrategy(Strategy strategy) { this.strategy = strategy;}
    public Strategy getStrategy() { return this.strategy;}
}
