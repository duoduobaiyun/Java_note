package cn_01;

public class Person {
    private  static  Person instance = new Person();
    private  Person() {System.out.println("我被创建了");}
    public  static  Person getInstance(){
        return  instance;
    }
}
