package kz.study.pattern.creational.builder;

public class DoctorRobotBuilder extends RobotBuilder {

    @Override
    public void buildName() {
        robot.setName("John");
    }

    @Override
    public void buildPrice() {
        robot.setPrice(300);
    }
}
