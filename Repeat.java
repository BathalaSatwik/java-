public class Repeat{
    public static void main(String[] args) {// In the array print the non repeating element.
        int nums[]={1,1,2,2,3,3,4,4,5};
        int result=singleNumber(nums);
        System.out.println(result);
        
    }
    static int singleNumber(int nums[]){
        int a=0;
        for(int i=0; i<nums.length;i++){
            a=a^nums[i];
        }
        return a;

    }
}
