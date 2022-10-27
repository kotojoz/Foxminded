package carmanager;

public enum Motorcycles {

    YAMAHA(new Motorcycle("Suzuki GSX-R1000", 2021, 16_000, 600, " black", "diesel", true)),
    SUZUKI(new Motorcycle("Yamaha  FZ1", 2007, 9_000, 700, "orangE", "gas", false));

    private final Motorcycle motorcycle;

    Motorcycles(Motorcycle motorcycle) {
        this.motorcycle = motorcycle;
    }

    public Motorcycle getMotorcycle() {
        return motorcycle;
    }
}
