package factoryPattern;

/**
*   <p>
*       A simple Zoombie class a family of Emeny to demonstrate Factory Design Pattern
*   </p>
*
*   @Author: KatlegoM
*   Date: 23/08/2022 16H16
*
 */

 public class ZoombieEnemy implements Enemy {

    public void attackPlayer() {
        System.out.println("Zoombie Attack");
    }

    public void seekPlayer() {
        System.out.println("Sneaky sneaky zoombie");
    }

    public void damage() {
        System.out.println("Zoombie damage: 1000PoW");
    }
 }
