package lecture02;

public class Human {
    String name;
    int age;

    Human(String name,int age){
        this.name=name;
        this.age=age;
    }

    void print(){
        if(0<=age && age<=18){
            System.out.print("生徒 : ");
        }
        else if(18<=age && age<=22){
            System.out.print("学生 : ");
        }
        else{
            System.out.print("　　 : ");
        }
        System.out.println(name+" "+age+"歳です。");
    }
}
