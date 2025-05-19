package numbers;
import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the num:");
		int num=scan.nextInt();
		int temp=num;
		int r,sum=0;
		 while(num>0) {
		   r=num%10;
		   num=num/10;
		   sum=sum+r*r*r;
		 }
		 if(sum==temp) {
			 System.out.println("ArmStrong number:"+temp);
		 }
		 else {
			 System.out.println("Not an Armstrong number:"+temp);
		 }
		
	}

}
