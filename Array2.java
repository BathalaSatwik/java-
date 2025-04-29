import java.util.Scanner;
public class Array2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);//two dimensional jagged array.
        int arr[][]=new int[4][];
        arr[0]=new int [2];
        arr[1]=new int [4];
        arr[2]=new int [5];
        arr[3]=new int [4];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.println("Enter the marks:"+i+"students"+j);
                arr[i][j]=sc.nextInt();
            }

        }
        for(int i=0; i<arr.length; i++){
            for( int j=0; j<arr[i].length; j++){
                System.out.println(arr[i][j]);
            }
        }

    }
    
}
