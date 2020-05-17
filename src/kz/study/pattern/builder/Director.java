package kz.study.pattern.builder;

import kz.study.pattern.builder.entity.Robot;

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
