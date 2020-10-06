import sun.font.DelegatingShape;

import java.util.Scanner;

public class cn_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入你期末成绩：(0-100)");
        int score = scan.nextInt();

        if (score == 100) {
            System.out.println("奖励一辆BWM");
        } else if (score > 80 && score <= 99) {
            System.out.println("奖励一台iphone xs max");
        } else if (score >= 60 && score <= 80) {
            System.out.println("奖励一个iPad");
        } else {
            System.out.println("什么奖励都没有");
        }

        //2.
        int x = 4;
        int y = 1;
        if (x > 2) {
            if (y > 2)//默认罩住下一行
                System.out.println(x + y);//归于上面一行
            System.out.println("kun");
        } else {
            System.out.println("x is + x");
        }


        //3.
        boolean b =true;
        if(b=false){
            System.out.println("a");
        }else if(b){
            System.out.println("b");
        }else if(!b){
            System.out.println("c");
        }else{
            System.out.println("d");
        }

    }
}
