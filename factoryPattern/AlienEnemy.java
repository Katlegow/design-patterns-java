package factoryPattern;

/**
*   <p>
*       A simple Alien class a family of Emeny to demonstrate Factory Design Pattern
*   </p>
*
*   @Author: KatlegoM
*   Date: 23/08/2022 16H20
*
 */

 public class AlienEnemy implements Enemy {

    public void attackPlayer() {
        System.out.println("Alien Attack");
    }

    public void seekPlayer() {
        System.out.println("Sneaky sneaky Alien");
    }

    public void damage() {
        System.out.println("Alien damage: 10000PoW");
    }
 }
