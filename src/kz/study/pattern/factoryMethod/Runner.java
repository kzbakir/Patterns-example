package kz.study.pattern.factoryMethod;

import kz.study.pattern.factoryMethod.entity.Developer;
import kz.study.pattern.factoryMethod.factory.DeveloperFactory;
import kz.study.pattern.factoryMethod.factory.JavaDeveloperFactory;
import kz.study.pattern.factoryMethod.factory.PythonDeveloperFactory;

public class Runner {

    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDeveloperFactoryByName("java");
        Developer developer = developerFactory.createDeveloper();
        developer.writeCode();
    }

    static DeveloperFactory createDeveloperFactoryByName(String name) {
        if (name.equalsIgnoreCase("java")){
            return new JavaDeveloperFactory();
        } else if (name.equalsIgnoreCase("python")) {
            return new PythonDeveloperFactory();
        } else {
            throw new RuntimeException(name + " is unknown");
        }
    }
}
