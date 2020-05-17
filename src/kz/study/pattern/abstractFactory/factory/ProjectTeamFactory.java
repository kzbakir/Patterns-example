package kz.study.pattern.abstractFactory.factory;

import kz.study.pattern.abstractFactory.entity.Developer;
import kz.study.pattern.abstractFactory.entity.Tester;

public interface ProjectTeamFactory {
    Developer getDeveloper();
    Tester getTester();
}
