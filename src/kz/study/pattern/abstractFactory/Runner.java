package kz.study.pattern.abstractFactory;

import kz.study.pattern.abstractFactory.factory.BankingSystemProjectTeamFactory;
import kz.study.pattern.abstractFactory.entity.Developer;
import kz.study.pattern.abstractFactory.entity.Tester;
import kz.study.pattern.abstractFactory.factory.ProjectTeamFactory;

public class Runner {

    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new BankingSystemProjectTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        developer.writeCode();
        tester.testingProduct();
    }
}
