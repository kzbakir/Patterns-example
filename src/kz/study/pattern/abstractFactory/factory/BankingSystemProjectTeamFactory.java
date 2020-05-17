package kz.study.pattern.abstractFactory.factory;

import kz.study.pattern.abstractFactory.entity.Developer;
import kz.study.pattern.abstractFactory.entity.JavaDeveloper;
import kz.study.pattern.abstractFactory.entity.QATester;
import kz.study.pattern.abstractFactory.entity.Tester;

public class BankingSystemProjectTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }
}
