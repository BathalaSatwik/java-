class Demo{
    int a=10, b=20, c=30;
    static int x=11,y=22,z=33;//In thsi program the control flow will goes to the static block .

    void display1(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
    static void display(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
public class StaticVariables{
    public static void main(String[] args){
    Demo.display();
    Demo d=new Demo();
    d.display1();
    }
}