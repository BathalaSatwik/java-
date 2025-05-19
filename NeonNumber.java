package numbers;
import java.util.Scanner;
public class NeonNumber {
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the num");
	 int num=sc.nextInt();
	 int temp=num;
	 int square=num*num ,lastdigit,result=0;
	 
	 
	 while(square>0) {
	 lastdigit=square%10;
	 result=result+lastdigit;
	 square=square/10;
	 }
	 if(result==temp) {
		 System.out.println("Neon number:"+temp);
	 }
	 else {
		 System.out.println("Not a neon number:"+temp);
	 }
	 
 }
}
