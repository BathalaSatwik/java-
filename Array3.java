import java.util.Scanner;
public class Array3{
    public static void main(String[] args) {//three dimensional array
        Scanner sc=new Scanner(System.in);
        int arr[][][]=new int[2][3][2];
         for(int i=0; i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                for(int k=0;k<arr[i][j].length; k++){
                    System.out.println("Enter the class:"+i+"student:"+j+"marks:"+k);
                    arr[i][j][k]=sc.nextInt();
                }
            }
         }
         for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                for(int k=0; k<arr[i][j].length;k++){
                    System.out.println(arr[i][j][k]);
                }
            }
         }
        
    }
}
