package kz.study.pattern.builder;

public class MilitaryRobotBuilder extends RobotBuilder {

    @Override
    public void buildName() {
        robot.setName("Alpha-007");
    }

    @Override
    public void buildPrice() {
        robot.setPrice(1500);
    }
}
