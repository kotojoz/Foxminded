package carmanager;

public class CarManager {

    public static void main(String[] args) {

        Motorcycle suzuki = new Motorcycle("Suzuki GSX-R1000", 2021, 16_000, 600, " black", "diesel", true);

        Motorcycle yamaha = new Motorcycle("Yamaha  FZ1", 2007, 9_000, 700, "orangE", "gas", false);

        suzuki.addDistance(250_000);
        yamaha.addDistance(250_000);
        suzuki.addDistance(11.5F);
        yamaha.addDistance(-11.5F);
        suzuki.destroyEngine();
        yamaha.destroyEngine();
        System.out.println(suzuki);
        System.out.println(yamaha);


    }

}
