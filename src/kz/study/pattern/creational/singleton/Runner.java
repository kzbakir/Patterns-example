package kz.study.pattern.creational.singleton;

import kz.study.pattern.creational.singleton.entity.Doctor;

public class Runner {

    public static void main(String[] args) {
        Doctor doctor = Doctor.getInstance();
        doctor.sayName();
    }
}
