/*
 * 可变个数形参的方法
 * 1.jdk  5.0新增的内容
 * 2.具体使用
 *   2.1 可变个数的形参的格式:数据类型...变量名*/

public class cn_48 {
    public static void main(String[] args) {
        cn_48 test = new cn_48();
        test.show(12);
        test.show("hello");
    }

    public void show(int i) {
    }

    //    public void show(String s){
//        System.out.println("show(string)");
//    }
    public void show(String... strs) {
          System.out.println("show(String...strs)");
    }
}
