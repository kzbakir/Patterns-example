package kz.study.pattern.creational.prototype;

import kz.study.pattern.creational.prototype.entity.Robot;
import kz.study.pattern.creational.prototype.factory.RobotFactory;

public class Runner {

    public static void main(String[] args) {
        Robot militaryRobot = new Robot("Alpha-007", 1500);
        RobotFactory robotFactory = new RobotFactory(militaryRobot);
        Robot militaryRobotClone = robotFactory.cloneRobot();
        System.out.println(militaryRobotClone);
    }

}
