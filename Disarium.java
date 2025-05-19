package numbers;
import java.util.Scanner;
public class Disarium {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your num:");
		int num=scan.nextInt();
		int temp=num;
		String count=Integer.toString(num);
		int length=count.length();
	    int lastdigit,sum=0;
		
		while(num>0) {
			lastdigit=num%10;
		    sum=sum+(int)Math.pow(lastdigit,length);
			num=num/10;
			length--;
		}
		if(temp==sum) {
			System.out.println("Disarium number:"+temp);
			
		}
		else {
			System.out.println("Not a disarium number:"+temp);
		}
		
	}

}
