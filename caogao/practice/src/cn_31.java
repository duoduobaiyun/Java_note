import java.util.Arrays;

public class cn_31 {
    public static void main(String[] args) {
        //1.使用冒泡排序,实现如下的数组从小到大排序
        int[] arr = new int[]{34, 5, 22, -98, 6, -76, 0, -3};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            System.out.println(Arrays.toString(arr));
        }
        //快排时间复杂度:0(nlogn)
        //冒泡排序时间复杂度:0(n^2)
        //堆排序、归并排序

        //2.如何反转上面的数组。请实现代码
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        System.out.println(Arrays.toString(arr));

        //3.复制上述数组,得到一个新的数组
        int[] arr1 = new int[arr.length];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr[i];
        }

        //4.使用线性查找,从上述数组中查找22是否存在。存在,返回所在的位置的索引。不存在,输出提示信息
        int dest = 0;
        boolean isFlag = true;
        for (int i = 0; i < arr.length; i++) {
            if (dest == arr[i]) {
                System.out.println(i);
                isFlag = false;
                break;
            }
        }
        if (isFlag) {
            System.out.println("未找到");
        }

        //或
        int dest1 =22;
        for (int i=0;i<arr.length;i++){
            if (dest1 ==arr[i]){
                System.out.println(i);
                break;
            }else if(i==arr.length){
                System.out.println("未找到");
            }
        }
    }
    //5.数组中常见的异常有哪些?请举例说明
    //ArrayIndexOutOfBoundsException:数组角标越界异常
    //合理范围:[0,arr.length -1]
    //越界:arr[-1]arr[arr.length]


    //NullPointerException:空指针异常
    //int[] arr=null;
    //int[] arr=null;
    //arr[0];
}
