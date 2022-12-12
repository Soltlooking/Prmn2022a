package Extra;

public class Gakusei {
    private Gakuseki gakuseki;
    private String name;
    private  Age age;

    Gakusei(Gakuseki gakuseki,String name,Age age){
        this.gakuseki=gakuseki;
        this.name=name;
        this.age=age;
    }
    public boolean isAdult(){
        return age.isOver20();
    }
}
