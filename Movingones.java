
import java.util.Arrays;

public class Movingones {
    public static void main(String[] args) {//moving ones.
        int arr[]={2,3,4,1,5,6,7,1,2};
        System.out.println(Arrays.toString(arr));
        int res[]=movingOnes(arr);
        System.out.println(Arrays.toString(res));
    }
      static int[] movingOnes(int[] arr){
        int j=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=1){
                arr[j]=arr[i];
                j++;
            }
        }
        for(int i=j; i<arr.length; i++){
         arr[i]=1;
      }
      return arr;
    }
}
    

