
/*类中方法的声明和使用
* 方法:描述类应该具有的功能
* 比如:Math类:sqrt()\random()\....
*     Scanner类:nextXxx()...
*     Arrays类:sort()\binarySearch()\toString()\equals()\....
*
* 1.举例:
* public void eat(){}                         //没有返回值
* public void sleep(int hour){}               //没有返回值
* public String  getName(){}                  //有返回值 ,返回值是String
* public String  getNation(String nation){}   //有返回值 ,返回值是String
*
* 2.方法的声明:权限修饰符 返回值类型 方法名(形参列表){
*              方法体
* }
*
* 注意:static、final、abstract 来修饰的方法,后面再讲
*
* 3.说明:
*     3.1关于权限修饰符:默认方法的权限修饰符先都使用public
*        Java规定的4种权限修饰符: private、public、缺省、protected --->封装性在细说
*
*     3.2返回值类型:有返回值vs没有返回值
*         3.2.1如果方法有返回值,则必须在方法声明,指定返回值的类型。同时,方法中,需要使用
*               return关键字来返回指定类型的变量或常量
*               如果方法没有返回值,则方法声明时,使用void来表示。通常,没有返回值的方法中,就不需要
*               使用return，但是,如果使用的话,只能"return;"表示结束此方法的意思
*
*         3.2.2我们定义方法该不该有返回值?
*               ①题目要求
*               ②凭经验,具体问题具体分析
*     3.3 方法名:属于标识符,遵循标识符的规则和规范,"见名之意"
*
*     3.4 形参列表:方法可以声明0个,1个,或多个形参。
*        3.4.1 格式:数据类型1 形参1,数据类型2 形参2......
*        3.4.2 我们定义方法时,该不该定义形参?
*               ①题目要求
*               ②凭经验,具体问题具体分析
*     3.5方法体:方法功能的体现
* return关键词的使用:
*     1.使用范围:使用在方法体中
*     2.作用:①结束方法
*      ②针对于有返回值类型的方法,使用"return" 数据"方法返回值所要的数据。
*     3.注意点:return关键词后面不可以声明执行语句
*  5.方法的使用,可以调用当前类的属性或方法。
*         特殊的:方法A中又调用了方法A:递归方法。
*    方法中,不可以定义方法。
*
* */

//void是没有返回值
//ctrl+shift+t
//ctrl+o

public class cn_35 {
    public static void main(String[] args){
        Custom cust1= new Custom();
        cust1.eat();
        //体会形参是否需要设置的问题
//        int[] arr=new int[]{3,4,5,2,5,63,2,5};
//        cust1.sort(arr);
          cust1.sleep(10);
    }



    //客户类
   static class Custom{
        //属性
        String name;
        int age;
        boolean isMale;

        //方法
        public void eat(){
            System.out.println("客户吃饭");
            return;//结束函数,跟break一样
            //return后不可以声明表达式
            //System.out.println("hello");
        }
        public void sleep(int hour){ //方法名
            System.out.println("休息了"+hour+"个小时");//步骤
            eat();//方法里面调用了方法
        }
        public String getName() {
            if (age < 18) {
                return name;//变量
            } else {
                return "Tom";//常量
            }
            //写if必须要有两个返回
        }
        public String getNation(String nation) {
            String info = "我的国籍:" + nation;
            return info;
        }

        //public void sort(int[] arr){
        //}

//        public void sort(){
//            int[] arr =new int[]{3,4,5,2,5,63,2,5}; 写死了,不灵活
//        }
    }
}
