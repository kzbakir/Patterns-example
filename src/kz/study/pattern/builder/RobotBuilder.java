package kz.study.pattern.builder;

import kz.study.pattern.builder.entity.Robot;

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
