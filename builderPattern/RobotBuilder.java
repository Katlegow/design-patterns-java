package builderPattern;

/**
 *   <p>
 *       This is a simple Robot Builder object to demonstrate builder design
 * pattern. It mainly responsible for creating a Robot instance for us
 * abstracting away the creating of the customised robot instance.
 *   </p>
 *
 *   @Athur: KatlegoM
 *   Date: 05/09/2022 11H49
 *
 */

public class RobotBuilder {
  private Robot robot;

  public RobotBuilder() { this.robot = new Robot(); }

  public RobotBuilder withHead(String head) {
    this.robot.setHead(head);
    return this;
  }

  public RobotBuilder withHands(String hands) {
    this.robot.setHands(hands);
    return this;
  }

  public RobotBuilder withManyHands(int handsCount) {
    this.robot.setHandsCount(handsCount);
    return this;
  }

  public RobotBuilder withTorso(String torso) {
    this.robot.setTorso(torso);
    return this;
  }

  public RobotBuilder withLegs(String legs) {
    this.robot.setLegs(legs);
    return this;
  }

  public RobotBuilder withManyLegs(int legsCount) {
    this.robot.setLegsCount(legsCount);
    return this;
  }

  public Robot build() { return this.robot; }
}
