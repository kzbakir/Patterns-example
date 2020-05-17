package kz.study.pattern.abstractFactory.entity;

import kz.study.pattern.abstractFactory.entity.Tester;

public class QATester implements Tester {

    @Override
    public void testingProduct() {
        System.out.println("QA Tester testing product");
    }
}
