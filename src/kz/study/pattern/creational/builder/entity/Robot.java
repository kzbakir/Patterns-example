package kz.study.pattern.creational.builder.entity;

public class Robot {
    private String name;
    private int price;

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
