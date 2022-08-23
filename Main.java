
import strategyPattern.*;
import observerPattern.*;
import singletonPattern.*;

public class Main {

    public static void main(String[] args) {

        // =========================== Strategy Pattern ========================

        // StrategyPattern client1 = new StrategyPattern(new StrategyA());
        // StrategyPattern client2 = new StrategyPattern(new StrategyB());

        // client1.getStrategy().run();
        // client2.getStrategy().run();

        // =========================== Obserser Pattern ========================

        // Publisher publisher = new Publisher();
        // Listner listner = new Listner(publisher);

        // Subscriber subscriber1 = new Subscriber(publisher);
        // Subscriber subscriber2 = new Subscriber(publisher);

        // listner.notify(
        //     new Message().withMessage("{ value: Just For Prac Sake}")
        // );

        // ========================== Singleton Pattern ========================

        // Singleton instance1 = Singleton.getInstance();
        // System.out.println("Instance 1: " + instance1.getInstanceID());

        // Singleton instance2 = Singleton.getInstance();
        // System.out.println("Instance 2: " + instance2.getInstanceID());

        Runnable instanceT1 = new SingletonThreadTest();
        Runnable instanceT2 = new SingletonThreadTest();

        new Thread(instanceT1).start();
        new Thread(instanceT2).start();
    }
}
