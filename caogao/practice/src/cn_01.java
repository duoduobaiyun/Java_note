import java.util.Scanner;

public class cn_01 {
    public static void main(String[]  args){
        int a =0;
        int result = ++a;
        System.out.println(result);

        int b=0;
        int result1 = +b;
        System.out.println(result1);

        int c= 10;
        int c1=c++;
        System.out.println("c="+c+",c1="+c1);

        int result2=(c++)+(c1++);
        System.out.println(result2);

        int d=0;
        System.out.println(d++);

        //获取两个整数的较大值
        int m =12;
        int n = 5;
        int max = (m<n)?m:n;
        System.out.println(max);
        //false取n,true取m

        if (m<n){
            System.out.println("你好世界");
        }else {
            System.out.println("再见世界");
        }
        int i=21;
        System.out.println(i<<2);//2的2次方
        System.out.println(i<<3);//2的3次方
        System.out.println(i>>2);//21/(2的2次方)=5
        System.out.println(i>>1);//21/(2的1次方)=10


        int z =45;
        System.out.println(z/2);

        Scanner scan =new Scanner(System.in);
        int num =scan.nextInt();
        System.out.println(num);

        
    }
}
