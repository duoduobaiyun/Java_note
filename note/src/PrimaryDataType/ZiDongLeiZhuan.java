package PrimaryDataType;
/*
* 自动类型转换
  必须满足转换前的数据类型的位数要低于转换后的数据类型，
* 例如: short数据类型的位数为16位，就可以自动转换位数为32的int类型，
* 同样float数据类型的位数为32，可以自动转换为64位的double类型。
* */
public class ZiDongLeiZhuan {
    public static void main(String[] args){
        char c1='a';//定义一个char类型
        int i1 =c1;//char自动类型转换为int
        System.out.println("char自动类型转换为int后的值等于"+i1);
        char c2 = 'A';//定义一个char类型
        int i2 = c2+1;//char 类型和 int 类型计算
        System.out.println("char类型和int计算后的值等于"+i2);
        /*
        * 解析：c1 的值为字符 a ,查 ASCII 码表可知对应的 int 类型值为 97， A 对应值为 65，所以 i2=65+1=66。
        * */
    }
}
