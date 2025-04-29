import java.util.Scanner;
public class Array1{
    public static void main(String []args){//two dimensional array
        Scanner sc=new Scanner(System.in);
        int arr[][]=new int [3][4];
         for(int i=0;i<arr.length;i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.println("Enter the marks:"+i+"Students:"+j);
                arr[i][j]=sc.nextInt();

            }
         }
         for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]);

            }
         }

    }
}