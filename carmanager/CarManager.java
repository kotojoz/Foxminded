package carmanager;

public class CarManager {

    public static void main(String[] args) {

        Motorcycle suzuki = Motorcycles.SUZUKI.getMotorcycle();

        Motorcycle yamaha = Motorcycles.YAMAHA.getMotorcycle();

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
