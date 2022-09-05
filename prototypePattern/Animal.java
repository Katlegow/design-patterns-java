package prototypePattern;

/**
 *   <p>
 *       This is a simple Animal interface to demonstrate prototype design
 * pattern. Can think of it as a protagonist or a very complex object we are
 * trying to make a copy of to utilise the resources. It extends Cloneable to
 * facilitate cloning.
 *   </p>
 *
 *   @Athur: KatlegoM
 *   Date: 05/09/2022 13H37
 *
 */

public interface Animal extends Cloneable { Animal makeCopy(); }
