
import java.util.Arrays;

public class Bubblesort{
    public static void main(String[] args) { //Bubblesort
        int arr[]={12,23,34,45,56,78};
        System.out.println(Arrays.toString(arr));
         int res[]=bubblesort(arr);
         System.out.println(Arrays.toString(res));
        
    }

  static int[] bubblesort(int arr[]){
    for(int i=0; i<arr.length-1;i++){
        for(int j=0; j<arr.length-1-i;j++){
            if(arr[j]<arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
    return arr;
}
}

