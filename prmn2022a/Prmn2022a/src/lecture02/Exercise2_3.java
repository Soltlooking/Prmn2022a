package lecture02;

public class Exercise2_3 {
    public static void main(String[] args) {
        Tire[] tires = new Tire[4];
        for(int i=0; i < tires.length; i++){
            // 配列の中身にインスタンスを入れる
            tires[i] = new Tire(65);
        }
        Engine engine = new Engine(4000);
        Car car = new Car(tires,engine);
        GasStation GS = new GasStation();
        GS.refuel(car);
        car.startEngine();
        car.run();
    }
}
