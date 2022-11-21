package lecture04;

import java.util.ArrayList;

public class ATM {
    ArrayList<Account> accountList= new ArrayList<Account>();
    void registerAccount(String name,String number){
        if(number.length()==5){
            for(int i=0;i<accountList.size();i++){
                if(accountList.get(i).getName().equals(name)){
                    if(accountList.get(i).getNumber().equals(number)){
                        System.out.println("\n >> 既に該当口座が存在します\n");
                        return ;
                    }
                }
            }
            accountList.add(new Account(name,number));
            System.out.println("\n >> " +name+" さんの口座を口座番号「 "+number+" 」で登録しました\n");
        }
        else{
            System.out.println("\n >> 入力に誤りがあります\n");
        }
    }
    boolean existsAccount(String name,String number){
        for(int i=0;i<accountList.size();i++){
            if(accountList.get(i).getName().equals(name)){
                if(accountList.get(i).getNumber().equals(number)){
                    return true;
                }
            }

        }
        return false;
    }
    void deposit(String number,long money){
            if(money<0){
                System.out.println("\n >> 0以上の自然数で入力してください\n");
            }
            else{
                for(int i=0;i<accountList.size();i++){
                    if(accountList.get(i).getNumber().equals(number)){
                        accountList.get(i).setBalance(accountList.get(i).getBalance()+money);
                        System.out.println("\n >> 口座番号「 "+number+" 」に "+money+" 円入金しました\n");
                        return;
                    }
                }
                System.out.println("\n >> 該当する口座番号は見つかりませんでした\n");
            }

    }
    long withdraw(String number,long money){
        if(money<0){
            System.out.println("\n >> 0以上の自然数で入力してください\n");
            return 0L;
        }
        else{
            for(int i=0;i<accountList.size();i++){
                if(accountList.get(i).getNumber().equals(number)){
                    if(accountList.get(i).getBalance()<money){
                        System.out.println("\n >> 引き出し希望額が残高を上回っています\n");
                        return accountList.get(i).getBalance();
                    }
                    accountList.get(i).setBalance(accountList.get(i).getBalance()-money);

                    System.out.println("\n >> 口座番号「 "+number+" 」から "+money+" 円引き出しました\n");
                    return accountList.get(i).getBalance();
                }
            }
            System.out.println("\n >> 該当する口座番号は見つかりませんでした\n");
            return 0L;
        }
    }
}
