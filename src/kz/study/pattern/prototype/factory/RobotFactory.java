package kz.study.pattern.prototype.factory;

import kz.study.pattern.prototype.entity.Robot;

public class RobotFactory {
    private Robot robot;

    public RobotFactory(Robot robot) {
        this.robot = robot;
    }

    public void setRobot(Robot robot) {
        this.robot = robot;
    }

    public Robot cloneRobot(){
        return (Robot) robot.copy();
    }
}
