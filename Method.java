class Addition{
    int a=999;
    int b=111;

    void add(){// this is method type-1; No-input No output
        int c=a+b;
        System.out.println(c);
    }
}
public class Method{
    public static void main(String[] args) {
        Addition add=new Addition();
        add.add();

        
    }
}
