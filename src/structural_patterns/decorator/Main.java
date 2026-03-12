package structural_patterns.decorator;

public class Main {
    static void main() {

        // basic car egea, It's 50k rn.
        ICar myCar = new BasicCar("Egea", 50000);

        System.out.println("Car: " + myCar.getDescription());
        System.out.println("Cost: " + myCar.getCost());
        System.out.println("------------------------------------------");

        System.out.println("Giving TurboDecorator to car will be swallowed");
        myCar = new TurboEngineDecorator(myCar); //updating the object

        System.out.println("Car: " + myCar.getDescription());
        System.out.println("Cost: " + myCar.getCost());
        System.out.println("------------------------------------------");

        System.out.println("Giving SteelRimDecorator to car will be swallowed");
        myCar = new SteelRimDecorator(myCar);

        System.out.println("Car: " + myCar.getDescription());
        System.out.println("Cost: " + myCar.getCost());
        System.out.println("------------------------------------------");

        //or just go like:
        ICar myCar2_withTurboAndRims = new TurboEngineDecorator(
                                             new SteelRimDecorator(
                                                     new BasicCar("Opel",20000)));
        System.out.println(myCar2_withTurboAndRims.getDescription());
        System.out.println(myCar2_withTurboAndRims.getCost());
        System.out.println("------------------------------------------");
    }
}
