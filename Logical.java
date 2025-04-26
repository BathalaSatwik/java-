import java.util.Scanner;
public class Logical{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in); //program of greatest among three numbers
        System.out.println("Enter the num1:");
        int num1=sc.nextInt();
        System.out.println("Enter the num2:");
        int num2=sc.nextInt();
        System.out.println("Enter the num3:");
        int num3=sc.nextInt();
        if(num1>num2 && num1>num3){
            System.out.println(num1);
            System.out.println("num1 is greatest");
        }
        else if(num2>num1 && num2>num3){
            System.out.println(num2);
            System.out.println("num2 is the greatest");
        }
        else{
            System.out.println(num3);
            System.out.println("num3 is the greatest");
        }

    }
}