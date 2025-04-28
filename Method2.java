class Subtraction{
    int c;
    void sub(int a,int b){// Its an second type method input and no output
        c=a+b;
        System.out.println(c);

    }
}
public class Method2 {
    public static void main(String[] args){
        int a=10;
        int b=20;
        Subtraction sub=new Subtraction();
        sub.sub(10,20);


    }
    
}
