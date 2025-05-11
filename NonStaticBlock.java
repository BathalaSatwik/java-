public class Dog{
    String name;
    String color;//if an non static block is present in the program along with thw constructor and display method this is the workflow.
    int cost;

    Dog(){
        System.out.println("Constructor is entered");
        name="Alex";
        color="blue";
        cost=100;
        System.out.println("Constructer is exicted");
    }
    {
        System.out.println("Non-Static blaock entered");
    }
    void display(){
        System.out.println("Display method entered");
        System.out.println(name);
        System.out.println(color);
        System.out.println(cost);
        System.out.println("display method excited");

}
}
public class NonStaticBlock{
    public static void main(String[] args) {
        Dog d=new Dog();
        d.display();

        
    }
}
