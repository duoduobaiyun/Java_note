//public class cn_40 {
//
//    /*
//     * 4.对象数组题目:
//     * 定义Student,包含三个属性:学号number(int),年级state(int),成绩score(int)
//     * 创建20个学生对象,学号1到20,年级和成绩都由随机数确定
//     * 问题一,打印3年级(state值为3)的学生信息
//     * 问题二:使用冒泡排序按学生成绩排序,并遍历所有学生信息
//     *
//     * 提示:
//     * 1)生成随机数:Math.random(),返回值类型double
//     * 2)四舍五入取整:Math.round(double d),返回值类型long*/
//
//        public static void main(String[] args) {
//            //声明Student类型的数组
//            Student1[] stus = new Student1[20];//对象数组String[] arr= new String[10];
//            for (int i = 0; i < stus.length; i++) {
//                //给数组元素赋值
//                stus[i] = new Student1();
//                //给Student对象属性赋值
//                stus[i].number = (i + 1);
//                //年级:[1,6]
//                stus[i].state = (int) (Math.random() * (6 - 1 + 1) + 1);
//                //成绩:[0,100]
//                stus[i].score = (int) (Math.random() * (100 - 0 + 1));
//            }
//
//
//            //遍历学生数组
//
//
//            System.out.println("**************************");
//
//            //问题一:打印出3年级(state值为3)的学生信息。
//
//
//            System.out.println("*************************");
//
//            //问题二:使用冒泡排序按学生成绩排序,并遍历所有学生信息
//
//            //遍历学生数组
//
//
//            /**
//             * @Descripition 遍历Student1[]数组操作
//             * @author shkstart
//             * @date 2019年1月15日下午5:08:08
//             * @param stus 要查找的数据
//             */
//            public void print(Student1[]stus){
//                for (int i = 0; i < stus.length; i++) {
//                    System.out.println(stus[i].info());
//                }
//            }
//
//        }
//        /**
//         * @Descripition 查找Student数组中指定年级的学生信息
//         * @author shkstart
//         * @date 2019年1月15日下午5:08:08
//         * @param stus 要查找的数据
//         * @param state  要找的年级
//         */
//        public void searchState (Student1[]stus,int state){
//            for (int i = 0; i < stus.length; i++) {
//                if (stus[i].state == state) {
//                    System.out.println(stus[i].info());
//                }
//            }
//        }
//
//
//        /**
//         * @Descripition 给student1数组排序
//         * @author shkstart
//         * @date 2019年1月15日下午5:09:08
//         * @param stus
//         */
//        public void sort (Student1[]stus){
//            for (int i = 0; i < stus.length - 1; i++) {
//                for (int j = 0; j < stus.length - 1 - i; j++) {
//                    //如果需要换序,交换的是数组元素:Student对象!
//                    Student1 temp = stus[j];
//                    stus[j] = stus[j + 1];
//                    stus[j + 1] = temp;
//                }
//            }
//        }
//
//
//        class Student1 {
//            int number;//学号
//            int state;//年级
//            int score;//成绩
//
//            //显示学生信息的方法
//            public String info() {
//                return "学号:" + number + ",年级:" + state + ",成绩:" + score;
//            }
//        }
//    }
////195集
