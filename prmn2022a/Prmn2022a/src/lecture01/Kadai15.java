package lecture01;

public class Kadai15 {
    public static void main(String[] args) {
        int[] score = {41,85,72,38,80};
        for(int i=0;i<score.length;i++){
            if(90<=score[i] && score[i]<=100){
                System.out.println(i+"番 "+score[i]+"点 "+"秀");
            }
            else if(80<=score[i] && score[i]<90){
                System.out.println(i+"番 "+score[i]+"点 "+"優");
            }
            else if(70<=score[i] && score[i]<80){
                System.out.println(i+"番 "+score[i]+"点 "+"良");
            }
            else if(60<=score[i] && score[i]<70){
                System.out.println(i+"番 "+score[i]+"点 "+"可");
            }
            else{
                System.out.println(i+"番 "+score[i]+"点 "+"不可");
            }
        }
        System.out.println("・・・\n最高点"+max(score)+"\n最低点"+min(score)+"\n平均点"+average(score)+"\n・・・");
    }
    public static int min(int[] score){
        int Min=score[0];
        for(int i:score){
            if(i<Min){
                Min=i;
            }
        }
        return Min;
    }

    public static int max(int[] score){
        int Max=score[0];
        for(int i:score){
            if(Max<i){
                Max=i;
            }
        }
        return Max;
    }

    public static double average(int[] score){
        int sum=0;
        double ave;
        for(int i:score){
            sum=sum+i;
        }
        ave=(double)sum/(double)score.length;
        return ave;
    }
}
