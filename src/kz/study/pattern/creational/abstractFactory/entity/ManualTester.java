package kz.study.pattern.creational.abstractFactory.entity;

public class ManualTester implements Tester {

    @Override
    public void testingProduct() {
        System.out.println("Manual Tester testing product");
    }
}
