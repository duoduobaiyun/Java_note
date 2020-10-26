/*
 * 方法的形参的传递机制:值传递
 * 1.形参:方法定义时,声明的小括号内的参数
 *   实参:方法调用时,实际传递给形参的数据
 * 2.值传递机制:
 * 如果参数是基本数据类型,此时实参赋给形参是,实参真实存储的数据值
 * */
public class cn_50 {
    public static void main(String[] args) {
        int m = 10;
        int n = 20;
        System.out.println("m=" + m + ",n=" + n);
        //交互两个变量的值的操作
//        int temp = m;
//        m = n;
//        n = temp;

        cn_50 test =new cn_50();//方法所在类的对象,类是指class文件名,对象是自己创建的
        test.swap(m,n);


        //System.out.println("m=" + m + ",n=" + n);

    }

    public void swap(int m, int n) {//交换两个变量值的方法
        int temp = m;
        m = n;
        n = temp;
        System.out.println("m=" + m + ",n=" + n);
    }
}
