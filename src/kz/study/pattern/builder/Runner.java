package kz.study.pattern.builder;

import kz.study.pattern.builder.entity.Robot;

public class Runner {

    public static void main(String[] args) {
        Director director = new Director();
        director.setRobotBuilder(new MilitaryRobotBuilder());
        Robot robot = director.buildRobot();

        System.out.println(robot);
    }
}
