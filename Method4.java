class Division{

    int div(int a,int b){
        int c=a/b;
        return c;
    }
}
public class Method4 {// method-4:input,output.
    public static void main(String[] args){
        int a=100;
        int b=10;
        Division div=new Division();
       int result= div.div(10,100);
        System.out.println(result);

    }

    
}
