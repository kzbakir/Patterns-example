package kz.study.pattern.factoryMethod.factory;

import kz.study.pattern.factoryMethod.entity.JavaDeveloper;

public class JavaDeveloperFactory implements  DeveloperFactory{

    @Override
    public JavaDeveloper createDeveloper() {
        return new JavaDeveloper();
    }
}
