package lecture03;

import java.util.Scanner;

public class Exercise3_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("1つめの整数 >> ");
        String numSt1= input.nextLine();
        int numIn1=Integer.parseInt(numSt1);
        System.out.print("2つめの整数 >> ");
        String numSt2= input.nextLine();
        int numIn2=Integer.parseInt(numSt2);
        System.out.print(numIn1+" + "+numIn2+" = "+(numIn1+numIn2));
    }
}
