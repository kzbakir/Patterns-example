package kz.study.pattern.creational.builder;

import kz.study.pattern.creational.builder.entity.Robot;

public abstract class RobotBuilder {
    protected Robot robot;

    public void createRobot() {
        robot = new Robot();
    }

    public Robot getRobot() {
        return robot;
    }

    abstract void buildName();

    abstract void buildPrice();
}
