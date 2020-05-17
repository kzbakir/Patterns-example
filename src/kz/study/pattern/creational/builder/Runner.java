package kz.study.pattern.creational.builder;

import kz.study.pattern.creational.builder.entity.Robot;

public class Runner {

    public static void main(String[] args) {
        Director director = new Director();
        director.setRobotBuilder(new MilitaryRobotBuilder());
        Robot robot = director.buildRobot();

        System.out.println(robot);
    }
}
