import java.util.Scanner;

public class cn_09 {
    /*
    * 不在循环条件部分限制次数的结构:for(;;;) 或while(true)
    * 结束循环有几种方式
    * 方式一:循环条件部分返回false
    * 方式二:在循环体中,执行break*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int positiveNumber = 0;//记录正整数个数
        int negativeNumber = 0;//记录负整数个数
        while (true){
            int number=scan.nextInt();

            //判断number的正负情况
            if (number >0){
                positiveNumber++;
            }else if (number<0){
                negativeNumber++;
            }else {
                //一旦执行break,跳出循序
                break;
            }
        }
        System.out.println("输入正整数个数为:"+positiveNumber);
        System.out.println("输入负整数个数为:"+negativeNumber);
    }
}
