package lecture02;

public class Car {
    int fuel;
    Tire[] tires=new Tire[4];
    Engine engine;
    Car(Tire[] tires,Engine engine){
        this.fuel=0;
        this.tires=tires;
        this.engine=engine;
    }
    void run(){
        if(fuel!=0){
            fuel-=1;
            System.out.println("燃料1減らして走りました。");
        }
        else{
            System.out.println("燃料無くて走れませんでした。");
        }
    }
    void startEngine(){
        engine.start();
    }
}
