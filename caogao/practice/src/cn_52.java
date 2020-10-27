import java.lang.reflect.Array;
import java.util.Arrays;

public class cn_52 {
    /*定义一个int类型数组:int[] arr=new[]{12,3,3,34,56,77,32}
    * 让数组的每个位置上的值去除以首位置的元素,得到的结果,作为该位置上的新值,遍历新的数组*/


    public static void main(String[] args) {
        int[] arr=new int[]{12,3,3,34,56,77,32};

        /*错误写法*/
//        for (int i=0;i< arr.length;i++){
//            arr[i]=arr[i]/arr[0];
//        }

        /*正确写法1*/
        for (int i=arr.length-1;i>=0;i--){
            arr[i]=arr[i]/arr[0];
        }

        System.out.println(Arrays.toString(arr));
        /*正确写法2*/
//        int temp =arr[0];
//        for (int i=0;i<arr.length;i++){
//            arr[i]=arr[i]/temp
//        }


    }
}
