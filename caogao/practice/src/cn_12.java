public class cn_12 {
    //优化二的方法
    public static void main(String[] args) {
        //获取当前时间距离1970-01-01 00:00:00 的毫秒数
        long start = System.currentTimeMillis();
        int count = 0;//记录质数的个数   优化四
        label: for (int i = 2; i <= 100000; i++) {//遍历100000以内的自然数
            for (int j = 2; j < Math.sqrt(i); j++) {//j:被i去除 优化三
                if (i % j == 0) {//i被j除尽
                   continue label;
                }
            }
            //能执行到此步骤的,都是质数
                count++;
        }
        //获取当前时间距离1970-01-01 00:00:00 的毫秒数
        long end = System.currentTimeMillis();
        System.out.println("质数的个数为:" + count);
        System.out.println("所花费的时间为:" + (end - start));
    }
}