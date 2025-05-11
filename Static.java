import java.util.Scanner;
class Farmer{
    float p ;/*  Introdution of static variables. In this program if we see memory allocation the rate of interest is same for all obejects but in this we are declaring seperately for every object thsi leads to consumption of memeory wastely*/
    float t;
    float f;
    float r;
    float si;
    void accpectInput(){ 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the principal amount:");
          p=sc.nextFloat();
        System.out.println("Enter the time duration:");
        t=sc.nextFloat();
        r=2.5f;
    }
    void compute(){
        si=(p*t*r)/100;
    }
    void finalAmount(){
        f =p+si;
    }
    void display(){
        System.out.println("This is the simple interest:"+si);
        System.out.println("This is the final amount:"+f);
    }
}
public class Static{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Farmer f= new Farmer();
        f.accpectInput();
        f.compute();
        f.finalAmount();
        f.display();
        Farmer f1=new Farmer(); 
        f1.accpectInput();
        f1.compute();
        f1.finalAmount();
        f1.display();
        Farmer f2=new Farmer(); 
        f2.accpectInput();
        f2.compute();
        f2.finalAmount();
        f2.display();
    }
}
