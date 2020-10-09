public class cn_10 {
    public static void main(String[] args) {
//        for (int i = 0; i < 9; i++) {//行
//            for (int j = 0; j < i; j++) {//列
//                System.out.print("*");
//            }
//            System.out.println();
//        }

       for (int i =0;i<7;i++){
           for (int j =0;j<7-i;j++){//因为7-0=7所以要打印7次列,就是在一行上打印7次*,还有一件事得注意,初始化得算一次,
                                    //也就是i=0本身也算一次,因为要算在j里面
             System.out.print("*");
           }
           System.out.println();
       }
    }
}