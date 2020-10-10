/*
* 100以内的所有质数的输出。
* 质数:素数,只能被1和它本身整除的自然数。--从2开始,到这个数-1结束为止,都不能被这个数本身整除
*
* 最小的质数是:2*/

/* 优化一*/
public class cn_11 {
    public static void main(String[] args){
        //获取当前时间距离1970-01-01 00:00:00 的毫秒数
        long start =System.currentTimeMillis();

        boolean isFlag=true;//标识i是否被除尽,一旦除尽,修改其他值
        int count=0;//记录质数的个数   优化四

        for(int i=2;i<=100000;i++){//遍历100000以内的自然数
            //boolean isFlag=true;//标识i是否被除尽,一旦除尽,修改其他值
            for (int j=2;j<Math.sqrt(i);j++){//j:被i去除 优化三
                if (i%j==0){//i被j除尽
                    isFlag =false;
                    break;//优化一:只对本身非质数的自然数是有效的
                    //System.out.println(i);
                }
            }
            //
            if (isFlag==true){
               //System.out.println(i);
                count++;
            }
            //重置isFlag
            isFlag=true;
        }
        //获取当前时间距离1970-01-01 00:00:00 的毫秒数
        long end =System.currentTimeMillis();
        System.out.println("质数的个数为:"+count);
        System.out.println("所花费的时间为:"+(end-start));
    }
}
