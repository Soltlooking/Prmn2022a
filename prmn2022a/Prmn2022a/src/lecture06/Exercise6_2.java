package lecture06;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Exercise6_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        ArrayList<Integer> dice=new ArrayList<Integer>();
        for(int i=0;i<5;i++){
            dice.add(random.nextInt(6)+1);
        }
        System.out.print("さいころを5つ振りました\n" +
                "何番目のさいころの値を確認しますか >> ");
        try {
            int index = input.nextInt();
            System.out.println(">>> "+dice.get(index));
        }
        catch (IndexOutOfBoundsException e){
            System.out.print("ArrayListの範囲外アクセスを確認しました\n" +
                    "プログラムを終了します");
        }
    }
}
