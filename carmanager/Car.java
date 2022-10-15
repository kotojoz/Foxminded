package carmanager;

import java.util.Objects;

public class Car {

    public String name;

    public int yearOfProduction;

    public int price;

    public int weight;

    public Color color;

    private int distance = 0;

    public Car(String name, int yearOfProduction, int price, int weight, Color color) {
        this.name = name;
        this.yearOfProduction = yearOfProduction;
        this.price = price;
        this.weight = weight;
        this.color = color;
    }

    /*
    Описание как все это работает, читать в комментариях Motorcycle addDistance
     */
    public void addDistance(int additionalDistance) {
        try {
            if (additionalDistance <= 0) {
                throw new RuntimeException("Additional distance must be greater then 0");
            }
            distance += additionalDistance;
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    public void addDistance(double additionalDistance) {
        addDistance(Math.round((float) additionalDistance));
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (yearOfProduction != car.yearOfProduction) return false;
        if (price != car.price) return false;
        if (weight != car.weight) return false;
        if (!Objects.equals(name, car.name)) return false;
        return color == car.color;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + yearOfProduction;
        result = 31 * result + price;
        result = 31 * result + weight;
        result = 31 * result + (color != null ? color.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", price=" + price +
                ", weight=" + weight +
                ", color=" + color +
                ", distance=" + distance +
                '}';
    }
}
