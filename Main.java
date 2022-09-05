
import builderPattern.*;
import factoryPattern.*;
import observerPattern.*;
import prototypePattern.*;
import singletonPattern.*;
import strategyPattern.*;

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

    // Runnable instanceT1 = new SingletonThreadTest();
    // Runnable instanceT2 = new SingletonThreadTest();

    // new Thread(instanceT1).start();
    // new Thread(instanceT2).start();

    // ========================= Factory Pattern ===========================
    // EnemyFactory factory = new EnemyFactory();

    // for (int i = 1; i < 50; i++) {
    //     Enemy enemy = null;

    //     if ((i % 2) == 0)
    //         enemy = factory.createEnemy("A");
    //     else
    //         enemy = factory.createEnemy("Z");

    //     enemy.seekPlayer();
    //     enemy.attackPlayer();
    //     enemy.damage();

    //     System.out.println("==============================================");
    // }

    // ======================== Builder Pattern ================================
    // RobotBuilder builder = new RobotBuilder();

    // Robot robot = builder.withHead("Plastic head")
    //                   .withHands("Elastic hands")
    //                   .withManyHands(1000)
    //                   .withTorso("Steal torso")
    //                   .withLegs("Wheel legs")
    //                   .withManyLegs(60)
    //                   .build();

    // System.out.println("Robot Succesfully Built!");

    // System.out.println(robot);

    // ======================= Prototype Pattern ===============================

    Sheep sally = new Sheep();

    Sheep dolly = (Sheep)sally.makeCopy();

    System.out.println("Sally hashCode: " + System.identityHashCode(sally));
    System.out.println("Dolly hashCode: " + System.identityHashCode(dolly));
  }
}
