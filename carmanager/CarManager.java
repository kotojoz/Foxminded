package carmanager;

public class CarManager {

    public static void main(String[] args) {

        Car prius = new Car("Toyota Prius", 2008, 15_000, 1200, "green");

        Car renault = new Car("Renault Laguna", 2000, 9_700, 1600, "white");


        Motorcycle suzuki = new Motorcycle("Suzuki GSX-R1000", 2021, 16_000, 600, "black", "diesel", true);

        Motorcycle yamaha = new Motorcycle("Yamaha  FZ1", 2007, 9_000, 700, "orange", "gas", false);

        System.out.println(prius);
        System.out.println(renault);
        System.out.println();
        System.out.println(suzuki);
        System.out.println(yamaha);
    }

}
