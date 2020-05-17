package kz.study.pattern.creational.singleton.entity;

public class Doctor {
    private final String NAME = "John";
    private static volatile Doctor instance;

    public void sayName(){
        System.out.println("My name is - " + NAME);
    }

    public static Doctor getInstance(){
        Doctor localInstance = instance;
        if (localInstance == null){
            synchronized (Doctor.class){
                localInstance = instance;
                if (localInstance == null) {
                    instance = localInstance = new Doctor();
                }
            }
        }
        return localInstance;
    }
}
