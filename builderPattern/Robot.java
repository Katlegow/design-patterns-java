package builderPattern;

/**
 *   <p>
 *       This is a simple Robot object to demonstrate builder design pattern.
 *       Can think of it as a protagonist or a very complex object we trying
 *       we are trying to provide flexible creation of it
 *   </p>
 *
 *   @Athur: KatlegoM
 *   Date: 05/09/2022 11H49
 *
 */

public class Robot {
  private String head;
  private String hands;
  private int handsCount;
  private String torso;
  private String legs;
  private int legsCount;

  public Robot() {}

  public void setHead(String head) { this.head = head; }
  public void setHands(String hands) { this.hands = hands; }
  public void setHandsCount(int handsCount) { this.handsCount = handsCount; }
  public void setTorso(String torso) { this.torso = torso; }
  public void setLegs(String legs) { this.legs = legs; }
  public void setLegsCount(int legsCount) { this.legsCount = legsCount; }

  public String toString() {
    return "Robot ["
        + " \n\tHead: " + head + " \n\tHands: " + hands +
        " \n\tHands Count: " + handsCount + " \n\tTorso: " + torso +
        " \n\tLegs: " + legs + " \n\tLegs Count: " + legsCount + "\n]";
  }
}
