package lecture02;

public class Exercise2_2 {
    public static void main(String[] args) {
        Car car = new Car();
        car.run();
        GasStation GS = new GasStation();
        GS.refuel(car);
        car.run();
    }
}
