package prototypePattern;

/**
 *   <p>
 *       This is a simple Animal interface to demonstrate prototype design
 *       pattern. Can think of it as a protagonist or a very complex object we
 * are trying to make a copy of to utilise the resources. It extends Cloneable
 * to facilitate cloning.
 *   </p>
 *
 *   @Athur: KatlegoM
 *   Date: 05/09/2022 13H37
 *
 */

public class Sheep implements Animal {

  public Sheep() { System.out.println("Created Sheep!"); }

  public Animal makeCopy() {

    System.out.println("Creating Dolly!");

    Sheep dolly = null;

    try {
      dolly = (Sheep)super.clone();
    } catch (CloneNotSupportedException ex) {
    }

    return dolly;
  }
}
