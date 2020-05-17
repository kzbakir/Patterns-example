package kz.study.pattern.creational.factoryMethod.factory;

import kz.study.pattern.creational.factoryMethod.entity.JavaDeveloper;

public class JavaDeveloperFactory implements  DeveloperFactory{

    @Override
    public JavaDeveloper createDeveloper() {
        return new JavaDeveloper();
    }
}
