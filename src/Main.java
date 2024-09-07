//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        final Bicycle bicycle1 = new Bicycle("bicycle1", 2);
        final Bicycle bicycle2 = new Bicycle("bicycle2", 2);
        final Car car1 = new Car("car1", 4);
        final Car car2 = new Car("car2", 4);
        final Truck truck1 = new Truck("truck1", 8, new SmallTrailer());
        final Truck truck2 = new Truck("truck2", 8, new BigTrailer());


        final WheeledTransport[] wheeledTransports = {bicycle1, bicycle2, car1, car2, truck1, truck2};
        for (WheeledTransport wheeledTransport : wheeledTransports) {
            wheeledTransport.check();
        }
    }
}