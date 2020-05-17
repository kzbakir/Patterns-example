package kz.study.pattern.creational.builder;

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
