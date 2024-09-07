public class Car extends WheeledTransport {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void check() {
        super.check();
        this.checkEngine();
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}
