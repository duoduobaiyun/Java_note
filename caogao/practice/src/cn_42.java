public class cn_42 {
    //1.面向对象学习的三条主线:
    /*
    * 1.Java类及类的成员:属性、方法、构造器:代码块、内部类
    * 2.面向对象的大特征:封装性、继承性、多态性、抽象性
    * 3.其他关键词:this、super、static、final、abstract、interface、package、import等
    * 大处着眼，小处着手
    **/

    //2.面向对象与面向过程(理解)
    /*
    * 1.面向过程:强调的是功能行为,以函数为最小单位,考虑怎么做
    * 2.面向对象:强调具备了功能的对象, 以类/对象为最小单位,考虑谁来做
    *
    * 举例对比:人把大象装进冰箱*/

    //3.完成一个项目(或功能)的思路
    /*
    * 根据问题需要,选择问题所针对的现实世界中的实体
    * 从实体中寻找解决问题相关的属性和功能,这些属性和功能就形成了概念世界中的类
    * 把抽象的实体用计算机语言进行描述,形成计算机世界中类的定义。即借助某种程序
    * 语言,把类构造成计算机能够识别和处理的数据结构
    * 将类实例化成计算机世界中的对象。对象是计算机世界中解决问题的最终工具
    **/
    //4.面向对象中的两个重要的概念
    /*
    * 类:对一类事物的描述,是抽象的、概念上的定义
    * 对象:是实际存在的该类事物的每个个体,因而也称为实例(interface)
    * 面向对象程序设计的重点是类的设计
    * 设计类,就是设计类的成员*/

    //二者的关系:
    /*
    * 对象,是由类new出来的,派生来的
    */

    //5.面向对象思想落地实现的规则一
    /*
    * ①创建类,设计类的成员
    * ②创建类的对象
    * ③通过“对象.属性”或“对象.方法”调用对象的结构*/

    //补充几个概念
    /*
    * 属性=成员变量=field=域、字段
    * 方法=成员方法=函数=method
    * 创建类的对象=类的实例化=实例化类*/

    //对象的创建与对象的内存解析
    /*
    * 典型代码:
    * Person p1 = new Person();
    * Person p2 =new Person();
    * Person p3=p1;没有新创建一个对象,共用一个堆空间中的对象实体
    *
    * 说明:
    * 如果创建了一个类的多个对象,则每个对象都独立的拥有一套类的属性。(非static的)
    * 意味着:如果我们修改一个对象属性a,则不影响另外一个对象属性a的值。*/

}