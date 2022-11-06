package lecture02;

public class Engine {
    int rpm;
    Engine(int rpm){
        this.rpm=rpm;
    }
    void start(){
        System.out.println("rpm = "+rpm+" でエンジン始動しました。");
    }
}
