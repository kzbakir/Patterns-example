package kz.study.pattern.singleton;

import kz.study.pattern.singleton.entity.Doctor;

public class Runner {

    public static void main(String[] args) {
        Doctor doctor = Doctor.getInstance();
        doctor.sayName();
    }
}
