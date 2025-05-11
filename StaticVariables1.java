class Demo{
    int a=10 ,b=20, c=30;
    static int x=2, y=3, z=4;//it is getting error because the variables of a,b,c not defined
    
    static void display1(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
    void display(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
public class StaticVariables1{
    public static void main(String[] args){
        Demo.display1();
        Demo d1=new Demo();
        d1.display();

    }
}