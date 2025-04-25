import java.util.Scanner;
public class Arth{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your num1:");
    int num1=sc.nextInt();
    System.out.println("Enter your num2:");
    int num2=sc.nextInt();
    int result1=num1+num2;
    System.out.println("Addition result:"+result1);
    int result2=num1-num2;
    System.out.println("Subtraction result:"+result2);
    int result3=num1*num2;
    System.out.println("multiplication result:"+result3);
    int result4=num1/num2;
    System.out.println("division result:"+result4);
    int result5=num1%num2;
    System.out.println("modulus result:"+result5);

  }
}