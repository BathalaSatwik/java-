class Multiplication{
    int a=10;
    int b=10;
    int c;

   int mul(){//method 3-No input and output.
    int c=a*b;
    return c;
   }

}
public class Method3 {
    public static void main(String[]args){
        Multiplication mul=new Multiplication();
        System.out.println(mul.mul());
    

    } 
}
