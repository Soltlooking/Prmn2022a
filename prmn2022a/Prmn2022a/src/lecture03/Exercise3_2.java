package lecture03;

import java.util.Scanner;

public class Exercise3_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x=1;

        System.out.print("入力する行数 >> ");
        int psg = input.nextInt();
        input.nextLine();
        String[] ArrayList = new String[psg];
        String msg;
        for(int i=0;i<psg;i++){
            System.out.print((i+1)+"行目 >> ");
            msg = input.nextLine();
            ArrayList[i]=msg;
        }
        System.out.println("入力結果");
        for(String i:ArrayList){
            System.out.println("["+x+"]"+i);
            x+=1;
        }
    }
}
