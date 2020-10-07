public class cn_03 {
    public static void main(String[] args){
        for(int i=0;i<100;i++){
            int value = (int)(Math.random()*90+10);//[10,99]
            //公式:[a,b]:(int)(Math.random()*(b-a+1)+a)
            System.out.println(value);
        }
        boolean b =true;
        if(b=false)
            System.out.println("a");
        else if(b)
            System.out.println("b");
        else if(!b)
            System.out.println("c");
        else
            System.out.println("d");
    }
}
