package kz.study.pattern.factoryMethod.factory;

import kz.study.pattern.factoryMethod.entity.Developer;
import kz.study.pattern.factoryMethod.entity.PythonDeveloper;

public class PythonDeveloperFactory implements DeveloperFactory {

    @Override
    public Developer createDeveloper() {
        return new PythonDeveloper();
    }
}
