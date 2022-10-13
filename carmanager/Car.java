package carmanager;

public class Car {

    public String name;

    public int yearOfProduction;

    public int price;

    public int weight;

    public String color;

    public Car(String name, int yearOfProduction, int price, int weight, String color) {
        this.name = name;
        this.yearOfProduction = yearOfProduction;
        this.price = price;
        this.weight = weight;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", price=" + price +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                '}';
    }
}
