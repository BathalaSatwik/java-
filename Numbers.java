import java.util.Scanner;
 public class Numbers{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the num:");//creating the upper limit.
        int num=sc.nextInt();
        int i=0;
        while(i<=num){
            System.out.println(i);
            i++;
        }
        
    }
}
 