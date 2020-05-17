package kz.study.pattern.creational.abstractFactory.factory;

import kz.study.pattern.creational.abstractFactory.entity.Developer;
import kz.study.pattern.creational.abstractFactory.entity.JavaDeveloper;
import kz.study.pattern.creational.abstractFactory.entity.QATester;
import kz.study.pattern.creational.abstractFactory.entity.Tester;

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
