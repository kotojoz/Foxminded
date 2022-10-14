package carmanager;

public class CarManager {

    public static void main(String[] args) {

        Motorcycle suzuki = new Motorcycle("Suzuki GSX-R1000", 2021, 16_000, 600, " black", "diesel", true);

        Motorcycle yamaha = new Motorcycle("Yamaha  FZ1", 2007, 9_000, 700, "orangE", "gas", false);

        System.out.println(suzuki);
        System.out.println(yamaha);
        System.out.println(suzuki.equals(yamaha));
    }

}
