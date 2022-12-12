package Extra;

public class Age {
    private int value;
    public Age(int value){
        if(value>=0&&value<=120){
            this.value=value;
            return;
        }
        throw new RuntimeException(value+"は年齢の条件を満たさない");
    }
    public boolean isOver20(){
        return value>=20;
    }
}
