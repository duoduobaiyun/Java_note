public class cn_20 {
    public static void main(String[] args){
        /*一维数组的声明与初始化*/
        //正确的方式
        int num;//声明
        num = 10;//初始化
        int id = 1001;//声明+初始化
        int[] ids;//声明
        //1.1静态初始化,数组的初始化和数组元素的赋值操作同时进行
        ids = new int[]{1001,1002,1003,1004};
        //1.2动态初始化:数组的初始化和数组元素的赋值操作分开进行
        String[] names =new String[5];

        int[] arr4 ={1,2,3,4,5};//类型推断

        /*错误的方式*/
        //int[] arr1 =new[];
        //int[5] arr2 =new int[5];
        //int[] arr3 = new int[3]{1,2,3}

        /*2.一维数组元素的引用:通过角标的方式调用。*/
        //数组的角标(或索引)从0开始的,到数组的长度-1结束
        names[0] = "王敏";
        names[1] = "王赫";
        names[2] = "张学良";
        names[3] = "王宏志";//charAt()字符
        names[4] = "周扬";

        /*3.数组的属性:length*/
        System.out.println(names.length);
        System.out.println(ids.length);

        /**
         * 说明:
         * 数组一旦初始化,其长度就是确定的。arr.length
         * 数组的长度一旦确定,就不可修改
         */

        /*4.一位数组的遍历*/
        for (int i=0;i<names.length;i++){
            System.out.println(names[i]);
        }

        /*5.一维数组元素的默认初始化*/
         /* >数组元素是整形:0
                * >数组元素是浮点型:0.0
                * >数组元素是char型,0或''
                * >数组元素是boolean型:false
                *
                * >数组元素是引用数据类型:null*/

        //6.一维数组的内存解析
    }
}
