public class cn_08 {
    public static void main(String[] args){
        //区别
        //1.
        int number = 10;
        while (number>10){
            System.out.println("hello:while");
            number--;
        }
        //总结:先判断是否满足条件,不满足就不执行

        //2.
        int number1 =10;
        do{
            System.out.println("hello:do-while");
            number1--;
        }while (number1>10);
        //总结:无所谓满足条件,先爽一次,也就是先执行一次,直到后面来判断条件是否满足,满足继续搞,总的来讲要加1次
    }
}
