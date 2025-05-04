
import java.util.Arrays;
public class Movingzeros{
    public static void main(String[] args) {//moving Zeros
        int nums[]={1,2,3,0,4,5,0,9};
        System.out.println(Arrays.toString(nums));
        int res[]=movingZeros(nums);
        System.out.println(Arrays.toString(res));
    }
    static int [] movingZeros(int[] nums){
        int j=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=0){
                nums[j]=nums[i];
                j++;
            }

        }
        for(int i=j; i<nums.length; i++){
            nums[i]=0;
        }
        return nums;
    }
}
