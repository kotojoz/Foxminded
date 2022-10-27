package carmanager;

public class CarManager {

    public static void main(String[] args) {

        Motorcycle suzuki = Motorcycles.SUZUKI.getMotorcycle();

        Motorcycle yamaha = Motorcycles.YAMAHA.getMotorcycle();

        Motorcycle yamaha1 = Motorcycles.YAMAHA.getMotorcycle();

        suzuki.addDistance(250_000);
        yamaha.addDistance(250_000);

        yamaha1.addDistance(300_000);
        suzuki.destroyEngine();
        yamaha.destroyEngine();

        System.out.println(suzuki);
        System.out.println(yamaha);
        System.out.println(yamaha1);


    }

}
