/*
 * 数组相关的概念
 * >数组名
 * >元素
 * >角标、下标、索引
 * >数组的长度:元素的个数
 *
 * 数组的特点
 * 数组是有序排列的
 * 数组属于引用数据类型的变量。数组的元素,既可以是基本数据类型,也可以说引用数据类型
 * 创建数组对象会在内存中开辟一整块连续的空间
 * 数组的长度一旦确定,就不能修改
 *
 * 数组的分类
 * 按照维数:一维数组、二维数组
 * 按照数组元素的类型:基本数据类型元素的数组、引用数据类型元素的数组
 * */
public class cn_13 {
    //第一道
    public static void main(String[] args) {
        //1.一维数组的声明和初始化
        int num;//声明
        num = 10;//初始化
        int id = 1001;//声明+初始化

        int[] ids;//声明
        //1.1静态初始化:数组的初始化和数组元素的赋值操作同时进行
        ids = new int[]{1001, 1002, 1003, 1004};
        //1.2动态初始化:数组的初始化和数组元素的赋值操作分开进行
        String[] names = new String[5];

        //错误写法
        /*int[] arr1=new int[];
          int[] arr2=new int[];
          int[] arr3 =new int[3]{1,2,3};
          //总结:数组一旦初始化完成,其长度就确定了。
         */

        //2.如何调用数组的指定位置的元素:通过角标的方式调用
        //数组的角标(或索引)从0开始的,到数组的长度-1结束
        names[0] = "王敏";
        names[1] = "王赫";
        names[2] = "张学良";
        names[3] = "王宏志";//charAt()字符
        names[4] = "周扬";
        //如何获取数组的长度
        //属性:length
        System.out.println(names.length);//5
        System.out.println(ids.length);
        //如何遍历数组的长度
        for(int i=0;i<names.length;i++){
            System.out.println(names[i]+" ");
        }




        //第二道
        //数组大小
        int size = 10;
        //定义数组
        double[] myList =new double[size];
        myList[0] = 5.6;
        myList[1] = 4.5;
        myList[2] = 3.3;
        myList[3] = 13.2;
        myList[4] = 4.0;
        myList[5] = 34.33;
        myList[6] = 34.0;
        myList[7] = 45.45;
        myList[8] = 99.993;
        myList[9] = 11123;
        //计算所有元素的总和
        double total = 0;
        for (int i= 0; i<size;i++){
            total +=myList[i];
        }
        System.out.println("总和为:"+total);



        //第三道
        double[] mylist1={1.9,2.9,3.4,3.5};

        //打印所有数组元素
        for (int i=0;i<mylist1.length;i++){
            System.out.println(mylist1[i]+" ");
        }
        //计算所有元素的总和
        double total1 = 0;
        for (int i = 0;i<mylist1.length;i++){
            total+=mylist1[i];
        }
        System.out.println("Total is" +total1);
        //查找最大元素
        double max = mylist1[0];
        for (int i =1;i<mylist1.length;i++){
            if (mylist1[i]>max)max =mylist1[i];
        }
        System.out.println("Max is"+ max);
    }
}
