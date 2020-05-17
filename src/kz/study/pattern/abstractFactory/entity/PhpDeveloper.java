package kz.study.pattern.abstractFactory.entity;

public class PhpDeveloper implements Developer {

    @Override
    public void writeCode() {
        System.out.println("Php developer write code");
    }
}
