public class Linear{
    public static void main(String[] args) { //linear search
        int arr[]={1,2,3,4,5,6,7};
        int key=7;
        int answer=linear(arr,key);
        if(answer>0){
            System.out.println("Element found:"+answer);
        }
        else{
            System.out.println("Element not found");
        }
    }
        static int linear(int arr[],int key){
            for(int i=0; i<arr.length; i++){
                if(arr[i]==key){
                   return i;
                }
            }
            return -1;
        }
        
    }

