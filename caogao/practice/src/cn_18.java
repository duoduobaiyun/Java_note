
/*
     二维数组的使用:
     规定:二维数组分为外层数组的元素,内层数组的元素
     int[][] arr=new[4][3];
     外层元素:arr[0],arr[1]等
     内层元素：arr[0][0],arr[1][2]等

     数组元素的默认初始化值
     针对初始化方式一,比如int[][]arr=new int[4][3]
     针对于初始化值为:地址值
     内层元素的初始化值为:与一维数组初始化情况相同

     针对初始化方式一,比如int[][]arr=new int[4][]
     对于初始化值为:null
     内层元素的初始化值为:不能调用,否则报错

    数组的内存解析
    * */
public class cn_18 {
    public static void main(String[]  args){
        int[][]arr =new int[4][3];
        int[] arr1 =new int[4];
        System.out.println(arr1);//地址
        System.out.println(arr);//地址
        System.out.println(arr[0]);//地址,二维数组里面下标为0的一维数组的值
        System.out.println(arr[0][0]);

        System.out.println("**********************");
        float[][] arr2 =new float[4][3];
        System.out.println(arr2[0][0]);//0.0

        System.out.println("**********************");

        String[][] arr3 =new String[4][2];
        System.out.println(arr3[1]);//地址
        System.out.println(arr3[1][1]);//null

        System.out.println("*************************");
        double[][] arr4 =new double[4][];
        System.out.println(arr4[1]);//null
        System.out.println(arr4[1][0]);//报错

    }
}
