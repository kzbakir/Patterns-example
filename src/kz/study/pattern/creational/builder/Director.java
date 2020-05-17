package kz.study.pattern.creational.builder;

import kz.study.pattern.creational.builder.entity.Robot;

public class Director {
    private RobotBuilder robotBuilder;

    public void setRobotBuilder(RobotBuilder robotBuilder) {
        this.robotBuilder = robotBuilder;
    }

    public Robot buildRobot() {
        robotBuilder.createRobot();
        robotBuilder.buildName();
        robotBuilder.buildPrice();
        Robot robot = robotBuilder.getRobot();
        return robot;
    }
}
