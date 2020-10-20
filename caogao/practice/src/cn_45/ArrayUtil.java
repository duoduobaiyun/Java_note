package cn_45;

//自定义数组的工具类
public class ArrayUtil {
    //求数组的最大值
    public int getMax(int[] arr) {
        int maxValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (maxValue < arr[i]) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }

    //求数组的最小值
    public int getMin(int[] arr) {
        int minValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (minValue > arr[i]) {
                minValue = arr[i];
            }
        }
        return minValue;
    }

    //求数组的总和
    public int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    //求数组的平均值
    public int getAvg(int[] arr) {
        return getSum(arr) / arr.length;
    }

    //反转数组
    public void reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
    }

    //复制数组
    public int[] copy(int[] arr) {
        int[] arr1 = new  int[arr.length];//要new一个
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr[i];
        }
        return  arr1;
    }

    //数组排序
    public void sort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length - 1 -i; j++) {
                if (arr[j] > arr[j + 1]) {//arr[j+1]=arr.length-1,因为j是第二个大的数,arr.length-1是最大的
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            //System.out.println(Arrays.toString(arr));
        }
    }

    //遍历数组
    public void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }

    //查找指定元素
    public int getindex(int[] arr, int dest) {
        for (int i = 0; i < arr.length; i++) {
            if (dest == arr[i]) {
                System.out.println(i);
                return i;
            }
        }
        return -1;//返回一个负数,表示没有找到
    }
}
