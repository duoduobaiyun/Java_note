public class cn_06 {
    public static void main(String[] args) {
        //算100里面的偶数
        int sum = 0;//记录所有偶数的和
        int count = 0;//记录所有偶数的个数
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                //System.out.println(i);
                sum += i;
                count++;
            }
        }
        System.out.println(sum);
        System.out.println(count);


        //2.
        /*
         * 编写程序从1循环到150,并在每行打印一个值,
         * 另外在每个3的倍数行上打印出“foo”,
         * 在每个5的倍数行打印“biz”,
         * 在每个7的倍数行上打印输出“baz”*/


        for (int i = 1; i <= 150; i++) {
            System.out.print(i + " ");

            if (i % 3 == 0) {
                System.out.print("foo");
            }
            if (i % 5 == 0) {
                System.out.print("biz");
            }
            if (i % 7 == 0) {
                System.out.print("baz");
            }
            System.out.println();
        }

        int a = 2;
        int b = 3;
        long c = (a != b) ? a : b;
        //当a不等于b,就打印a,当a==b,就打印b
        System.out.println(c);


//        //使用for循环遍历100以内的奇数,并计算所有的奇数的和并输出。
//        int sum1 = 0;
//        int count1=0;
//        for (int j=0 ;j<100;j++){
//            if (j%2!=0){
//                System.out.println(j);
//                sum1=j;
//            }else {
//                sum1=1;
//                count1++;
//            }
//            System.out.println(sum1);
//            System.out.println(count1);
//        }
    }
}
