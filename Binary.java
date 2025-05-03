public class Binary{
    public static void main(String[] args) {//Binary search
        int arr[]={1,3,4,5,6,7,8};
        int key=8;
        int answer=binarysearch(arr,key);
        if(answer>=0){
            System.out.println("Key is found:"+answer);
        }
        else{
            System.out.println("Key is not found");
        }
    }
        static int binarysearch(int arr[], int key){
                int low=0;
                int high=arr.length-1;
                int mid;
                while (high>=low) { 
              mid=high+low/2;
              if(key==arr[mid]){
                return mid;
              }
              else if(key>arr[mid]){
                low=mid+1;
              }
              else{
                high=mid-1;
              }


                }
                return -1;

                
            }
        }
        

