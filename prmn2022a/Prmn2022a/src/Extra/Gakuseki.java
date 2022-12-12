package Extra;

public class Gakuseki {
    private  String value;

    public Gakuseki(String value){
        //first ga "b"
        //number ha nana keta
        String kashira = value.substring(0,1);
        String sonoato = value.substring(1,8);
        if(kashira.equals("b")&&sonoato.length()==7){
            this.value=value;
            return;
        }
        throw  new RuntimeException(value + "は学籍番号じゃない");
    }
}
