package lecture01;

import java.util.Scanner;

public class Kadai13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        if(age >= 0 && age <= 19){
            System.out.println("I am "+age+" years old so I cannot drink liquor.");
        }
        else if(age >= 20 && age <= 120){
            System.out.println("I am "+age+" years old so I can drink liquor.");
        }
        else{
            System.out.println("You are not EXIST.");
        }
    }
}
