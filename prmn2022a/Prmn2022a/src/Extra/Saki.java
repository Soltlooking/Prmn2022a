package Extra;

public class Saki {
    public static void main(String[] args) {
        Gakusei Saki = new Gakusei(new Gakuseki("b2211220"),"塩見早紀",new Age(21));
        boolean isadult = Saki.isAdult();
        if(isadult){
            System.out.println("成人");
        }
        else{
            System.out.println("成人でない");
        }
    }
}
