public class cn_1 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 5, 6, 8, 9};
        int[] index = new int[]{0,2,4,1,4,5,3,6,1,2,3};
        String tel = "";
        for (int i = 0; i < index.length; i++) {
            tel += arr[index[i]];
        }
        System.out.println("我的联系方式:" + tel);
    }
}

