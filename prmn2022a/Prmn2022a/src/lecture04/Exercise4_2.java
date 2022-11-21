package lecture04;

import java.util.Scanner;

public class Exercise4_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ATM atm = new ATM();
        String name;
        String number;
        long balance;
        long money;
        while(true){
            System.out.println(" >> いらっしゃいませ");
            System.out.println(" >> ご利用方法をお選びください");
            System.out.print("\n1: 口座開設　2:　口座照会　3:　預け入れ 4: 引き出し 他: 取引終了\n >> ");
            int next = input.nextInt();
            switch (next){
                case 1:
                    System.out.println("\n >> お名前と口座番号を入力してください");
                    System.out.print(" >> お名前 >>> ");
                    name = input.next();
                    System.out.print(" >> 口座番号 >>> ");
                    number = input.next();
                    atm.registerAccount(name,number);
                    break;
                case 2:
                    System.out.println("\n >> お名前と口座番号を入力してください");
                    System.out.print(" >> お名前 >>> ");
                    name = input.next();
                    System.out.print(" >> 口座番号 >>> ");
                    number = input.next();
                    boolean exist = atm.existsAccount(name,number);
                    if(exist){
                        System.out.println("\n >> 口座番号「　"+number+" 」/ "+name+" の口座は存在します\n");
                    }
                    else{
                        System.out.println("\n >> 口座番号「　"+number+" 」/ "+name+" の口座は存在しません\n");
                    }
                    break;
                case 3:
                    System.out.println("\n >> 口座番号を入力してください");
                    System.out.print(" >> 口座番号 >>> ");
                    number = input.next();
                    System.out.println(" >> 預け入れ額を入力してください");
                    System.out.print(" >> 預け入れ希望額 >>> ");
                    money = input.nextLong();
                    atm.deposit(number,money);
                    break;
                case 4:
                    System.out.println("\n >> 口座番号を入力してください");
                    System.out.print(" >> 口座番号 >>> ");
                    number = input.next();
                    System.out.println(" >> 引き出し額を入力してください");
                    System.out.print(" >> 引き出し希望額 >>> ");
                    money = input.nextLong();
                    balance = atm.withdraw(number,money);
                    if(balance!=0L){
                        System.out.println(" >> 残高は "+balance+" 円です\n");
                    }
                    break;
                default:
                    System.out.println("\n >> ありがとうございました　[ 終了 ]");
                    System.exit(1);
                    break;
            }
        }

    }
}
