
import java.util.Arrays;

public class Sum {
    public static void main(String[] args){//sum of two elements equal to one then print the indicies
        int arr[]={1,2,5,3,8,9};
        int target =10;
        int res[]=twoSum(arr,target);
        System.out.println(Arrays.toString(res));
    }
    static int [] twoSum (int arr[], int target){
        int res[]={-1,-1};
        for(int i=0; i<arr.length; i++){
            for (int j=i+1; j<arr.length; j++){
                if(arr[i]+arr[j]==target){
                    res[0]=i;
                    res[1]=j;
                    return res;

                }
            }
        }
            return res;
        }
    }
