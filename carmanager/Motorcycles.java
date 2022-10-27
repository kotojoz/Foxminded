package carmanager;

public enum Motorcycles {

    SUZUKI(new Motorcycle("Suzuki GSX-R1000", 2021, 16_000, 600, " black", "diesel", true)),
    YAMAHA(new Motorcycle("Yamaha  FZ1", 2007, 9_000, 700, "orangE", "gas", false));

    private final Motorcycle motorcycle;

    Motorcycles(Motorcycle motorcycle) {
        this.motorcycle = motorcycle;
    }

    /*Геттер, который возвращает копию мотоцикла из поля motorcycle. То есть при каждом запросе возвращает новый объект.
    * Если возвращать сразу motorcycle, то поле мотоцикла можно будет изменить, а это неправильно.
    * Константы не должны изменяться. Можете попробовать вернуть motorcycle вместо newMotorcycle(motorcycle),
    *  а потом в CarManager внести изменения в yamaha, yamaha1, suzuki и вывести изменения
    */
    public Motorcycle getMotorcycle() {
        return new Motorcycle(motorcycle); // для этого был создан в классе Motorcycle новый конструктор
    }
}
