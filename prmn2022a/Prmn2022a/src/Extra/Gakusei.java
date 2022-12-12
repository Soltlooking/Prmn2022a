package Extra;

public class Gakusei {
    private String gakuseki;
    private String name;
    private int age;

    Gakusei(String gakuseki,String name,int age){
        this.gakuseki=gakuseki;
        this.name=name;
        this.age=age;
    }

    protected void isAdult(){
        if(this.age>=18){
            System.out.println("成人");
        }
        else{
            System.out.println("成人ではない");
        }
    }
}
