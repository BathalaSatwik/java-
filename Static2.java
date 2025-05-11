import java.util.Scanner;
class Farmer{
    float p;
    float t;
    float si;
    float f;
    static float r;

static {
    r=2.5f;
}
void acceptInput(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the principal Amount:");
    p=sc.nextFloat();
    System.out.println("Enter the time duration:");
    t=sc.nextFloat();
}
void compute(){
    si=(p*t*r)/100;
}
void finalAmount(){
    f=p+si;
}
void display(){
    System.out.println("This is your Simple-interst Amount:"+si);
    System.out.println("This is the final Amount:"+f);
}
}
public class Static2{
    public static void main(String[] args){
        Farmer f=new Farmer();
        f.acceptInput();
        f.compute();
        f.finalAmount();
        f.display();
    }
}