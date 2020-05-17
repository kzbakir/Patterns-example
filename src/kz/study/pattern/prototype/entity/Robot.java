package kz.study.pattern.prototype.entity;

public class Robot implements Copyable {
    private String name;
    private int price;

    public Robot(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
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

    @Override
    public Object copy() {
        Robot robot = new Robot(name, price);
        return robot;
    }
}
