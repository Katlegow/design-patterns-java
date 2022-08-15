package strategyPattern;
/**
*   <p>
*       A simple Strategy class which is a family of Strategy algorthms.
*       Basic intro to Strategy Design Pattern.
*   </p>
*
*   @Author: KatlegoM
*   Date: 20221508
*/
public class StrategyA implements Strategy {

    @Override
    public void run() {
        System.out.println("Executing|Using strategy A!");
    }
}
