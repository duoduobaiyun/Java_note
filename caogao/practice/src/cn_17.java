public class cn_17 {
    public static void main(String[] args){
        //1.二维数组的声明和初始化
        int[] arr =new int[]{1,2,3};//一维数组
        //静态初始化
        int[][] arr1=new int[][]{{1,2,3},{4,5},{6,7,8}};//行和列
        //动态初始化1
        String[][] arr2 =new String[3][2];
        //动态初始化2
        String[][] arr3 =new String[3][];
        //错误情况
//        String[][] arr4 =new String[][4];
//        String[4][3] arr5=new String[3][];
//        int[][]arr6 =new int[4][3]{{1,2,3},{4,5},{6,7,8}}
        //正确:
        int[] arr4[] =new int[][]{{1,2,3},{4,5},{6,7,8}};
        int[] arr5[] ={{1,2,3},{4,5},{6,7,8}};//类型推断
        //2.如何调用数组的指定位置的元素
        System.out.println(arr1[0][1]);//2
        System.out.println(arr2[1][1]);//null

        arr3[1] =new String[4];
        System.out.println(arr3[1][0]);

        //获取数组的长度
        System.out.println(arr.length);//一维数组
        System.out.println(arr2.length);//3
        System.out.println(arr4.length);//3
        System.out.println(arr4[0].length);//3
        System.out.println(arr5.length);
        //总结[][]第一个中括号是代表有多少个一维数组例如{。。。。。}第二个括号代表是{1,2,3}里面的元素

        //4.如何遍历二维数组
        for (int i = 0;i<arr4.length;i++){
            for (int j=0;j<arr4[i].length;j++){
                System.out.print(arr4[i][j]+"  ");
            }
            //因为arr4.length是3也就是3个一维数组,arr[i],当i初始化=0,所以一维数组有多少个元素,是3个,所以arr4[i][j]能打印出二维数组
            System.out.println();
        }


    }
}
