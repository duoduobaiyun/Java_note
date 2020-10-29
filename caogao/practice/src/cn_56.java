public class cn_56 {
    /*如何判断是否构成方法的重载?
    * 严格按照定义判断:两同一不同。
    * 跟方法的权限修饰符、返回值类型、形参变量名、方法体都没关系！
    *
    *
    * 使用说明:
    * 1.jdk 5.0新增的内容
    * 2.具体使用:
    * 2.1可变个数形参的格式:数据类型...变量名
    * 2.2当调用可变个数形参的方法时传入的参数个数可以是:0个，1个，2个...
    * 2.3可变个数形参的方法与本类中的方法名相同,形参不同的方法之间构成重载
    * 2.4可变个数形参的方法与本类中方法名相同,形参类型也相同的数组之间不构成重载.换句话说,二者不能共存
    * 2.5可变个数形参在方法的形参中,必须声明在末尾
    * 2.6可变个数形参在方法的形参中,最多只能声明一个可变形参*/
}