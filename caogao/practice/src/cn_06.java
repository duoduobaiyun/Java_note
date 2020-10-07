import java.util.Scanner;

public class cn_06 {
    public static void main(String[] args){
            int  year = 0
            //var year  int
            System.out.println("请输入年份");
            Scanner scan = new Scanner(System.in);
            System.out.println("请输入年份");
            int year =scan.nextInt();


            int month = 0;
            //var month  int
        System.out.println("请输入月份");
        int year =scan.nextInt();

            day := 0
            //var day  int
            //fmt.Println("请输入第几天")
            //fmt.Scanln(&day)
            switch month {
                case 1,3,5,7,8,10,12:
                    day = 31

                case 4,6,9,11:
                    day = 30
                case 2:
                    if year%400 == 0 || year%4 == 0 && year%100 != 0{
                    day = 29
                }else {
                    day = 20
                }
                default:
                    fmt.Println("月份有误")
            }
            fmt.Printf("%d 年 %d 月 的天数是: %d\n",year,month,day)
        }

    }
}
