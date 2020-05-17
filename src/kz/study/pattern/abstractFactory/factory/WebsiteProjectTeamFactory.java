package kz.study.pattern.abstractFactory.factory;

import kz.study.pattern.abstractFactory.entity.Developer;
import kz.study.pattern.abstractFactory.entity.ManualTester;
import kz.study.pattern.abstractFactory.entity.PhpDeveloper;
import kz.study.pattern.abstractFactory.entity.Tester;

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
