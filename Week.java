import java.util.Scanner;
public class Week{
 public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the num1");
    int num1=sc.nextInt();
    if(num1==1){
        System.out.println("Monday");
    }
    else if(num1==2){
        System.out.println("Tuesday");
    }
    else if(num1==3){
        System.out.println("Wednesday");
    }
    else if(num1==4){
        System.out.println("Thrusday");
    }
    else if(num1==5){
        System.out.println("Friday");
    }
    else if(num1==6){
        System.out.println("Saturday");
    }
    else if(num1==7){
        System.out.println("Sunday");
    }
    else if(num1>7){
        System.out.println("Entered number is above 7");
    }
}

 }