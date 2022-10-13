package carmanager;

public class Motorcycle {

    public String name;

    public int yearOfProduction;

    public int price;

    public int weight;

    public String color;

    public String engineType;

    public boolean isReadyToDrive;

    public Motorcycle(String name, int yearOfProduction, int price, int weight, String color, String engineType, boolean isReadyToDrive) {
        this.name = name;
        this.yearOfProduction = yearOfProduction;
        this.price = price;
        this.weight = weight;
        this.color = color;
        this.engineType = engineType;
        this.isReadyToDrive = isReadyToDrive;
    }
}
