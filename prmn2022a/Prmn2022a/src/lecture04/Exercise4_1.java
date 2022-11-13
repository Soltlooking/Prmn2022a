package lecture04;

public class Exercise4_1 {
    public static void main(String[] args) {
        boolean aliveF1=true;
        boolean aliveF2=true;
        Fighter F1 = new Fighter(500,100,"Adam");
        Fighter F2 = new Fighter(500,50,"Eve");
        while (aliveF1 && aliveF2){
            F1.attack(F2);
            aliveF2=F2.isAlive();
            if(!aliveF2){
                System.out.println("\n"+F2.getName()+" : Knock Out");
                break;
            }
            F2.attack(F1);
            aliveF1= F1.isAlive();
            if(!aliveF1){
                System.out.println("\n"+F1.getName()+" : Knock Out");
                break;
            }
        }
    }
}
