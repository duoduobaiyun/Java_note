public class cn_19 {
    public static void main(String[] args) {
        //1.写出一维数组初始化的两种方式
        int[] arr = new int[5];//动态初始化
        String[] arr1 = new String[]{"Tom", "Jerry", "Jim"};//静态初始化

        //数组一旦初始化,其长度就是确定的。arr.length
        //数组长度一旦确定,就是不可修改

        //2.写出二维数组初始化的两种方式
        int[][] arr2 = new int[4][3];//动态初始化1
        int[][] arr3 = new int[4][];//动态初始化2
        int[][] arr4 = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8}};//静态初始化

        //3.如何遍历如下的二维数组
        int[][] arr5 = new int[][]{{1, 2, 3}, {4, 5}, {6, 7, 8}};
        for (int i = 0; i < arr5.length; i++) {
            for (int j = 0; j < arr5[i].length; j++) {
                System.out.print(arr5[i][j] + "\t");
            }
            System.out.println();
        }

        //4.不同类型的一位数组元素的默认初始化值各是多少
        /*
        * 整型:0
        * 浮点型:0.0
        * char:0
        * boolean:false
        * 引用类型:null
        * */
    }
}
