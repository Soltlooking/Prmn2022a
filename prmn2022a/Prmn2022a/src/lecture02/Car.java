package lecture02;

public class Car {
    int fuel;
    Car(){
        this.fuel=0;
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
}
