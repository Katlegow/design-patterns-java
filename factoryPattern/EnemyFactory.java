package factoryPattern;

/**
*   <p>
*       A simple EnemyFactory class to demonstrate Factory Design Pattern
*   </p>
*
*   @Author: KatlegoM
*   Date: 23/08/2022 16H20
*
 */

 public class EnemyFactory {

    public EnemyFactory() {

    }

    public Enemy createEnemy(String type) {
        switch(type) {
            case "A":
                return new AlienEnemy();
            case "Z":
                return new ZoombieEnemy();
        }
        return null;
    }
 }
