package lecture03;

import java.util.Scanner;

public class Exercise3_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("入力 >> ");
        String msg = input.nextLine();
        System.out.println("「 "+msg+" 」と入力されました");
    }
}
