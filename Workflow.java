
class Work{
    int a,b,c;
     static int x,y,z; //The workflow=static block,static block method,non static block,constrctor,Non static method.

    {
        System.out.println("Non Static bloack is entered");
        a=10;
        b=20;
        c=30;
        System.out.println("non staic block is excited");
    }
    static{
        System.out.println("Static block entered");
        x=11;
        y=22;
        z=33;
        System.out.println("Static block is excited");
    }
    Work(){
        System.out.println("Constructor is entered");
        System.out.println("Constructor is excited");
    }
     void display(){
        System.out.println("Non-static method is entered");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println("non-static method is excited");
    }
    static void display2(){
        System.out.println("Static method is entered");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println("Satic method is excited");
    }
}
public class Workflow{
    public static void main(String[] args) {
        Work.display2();
        Work w=new Work();
        w.display();
        
    }
}

