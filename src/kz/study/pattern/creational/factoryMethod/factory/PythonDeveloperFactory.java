package kz.study.pattern.creational.factoryMethod.factory;

import kz.study.pattern.creational.factoryMethod.entity.Developer;
import kz.study.pattern.creational.factoryMethod.entity.PythonDeveloper;

public class PythonDeveloperFactory implements DeveloperFactory {

    @Override
    public Developer createDeveloper() {
        return new PythonDeveloper();
    }
}
