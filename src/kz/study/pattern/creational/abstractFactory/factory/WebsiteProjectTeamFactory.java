package kz.study.pattern.creational.abstractFactory.factory;

import kz.study.pattern.creational.abstractFactory.entity.Developer;
import kz.study.pattern.creational.abstractFactory.entity.ManualTester;
import kz.study.pattern.creational.abstractFactory.entity.PhpDeveloper;
import kz.study.pattern.creational.abstractFactory.entity.Tester;

public class WebsiteProjectTeamFactory implements ProjectTeamFactory {

    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }
}
