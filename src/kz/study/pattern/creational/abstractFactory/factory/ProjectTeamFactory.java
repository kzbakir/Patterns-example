package kz.study.pattern.creational.abstractFactory.factory;

import kz.study.pattern.creational.abstractFactory.entity.Developer;
import kz.study.pattern.creational.abstractFactory.entity.Tester;

public interface ProjectTeamFactory {
    Developer getDeveloper();
    Tester getTester();
}
