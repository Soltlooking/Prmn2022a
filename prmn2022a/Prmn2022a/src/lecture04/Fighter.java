package lecture04;

public class Fighter {
    private int hitPoint;
    private int power;
    private String name;

    public Fighter(int hitPoint,int power,String name){
        this.hitPoint=hitPoint;
        this.power=power;
        this.name=name;
    }

    public int getHitPoint(){
        return this.hitPoint;
    }

    public String getName(){
        return this.name;
    }

    public void setHitPoint(int hitPoint){
        this.hitPoint=hitPoint;
    }

    void attack(Fighter enemy){
        enemy.setHitPoint(enemy.getHitPoint()-this.power);
        System.out.println(enemy.getName()+"<-"+this.getName()+" : "+this.power+" damage");
        System.out.println(enemy.getName()+" : HP "+enemy.getHitPoint());
    }

    boolean isAlive(){
        return this.getHitPoint()>0;
    }

}
