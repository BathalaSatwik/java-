import java.util.Scanner;
public class For {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");//factorial of a number
        int num=sc.nextInt();
        int factorial=1;
        int i;
        for(i=1; i<=num; i++){
            factorial=factorial*i;

        }
        System.out.println("factorial of a number:"+factorial);
        
    }}
    

