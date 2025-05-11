class Dog{
    String name;
    String color; //this is the workflow of the program if program has 2 non static block and 2 2 constructor. 
    int cost;

    {
        System.out.println("Non Static block1 entered");//this block excutes as many time sthe object creation is there.
    }

    Dog(){
        System.out.println("Constructor is entered");
        name="Alex";
        color="black";
        cost=100;
        System.out.println("Constructor is excited");
    }
    {
        System.out.println("Non static block2 entered");
    }
    Dog(String name,String color, int cost){
        System.out.println("Three parameterized constructor is entered");
        this.name=name;
        this.color=color;
        this.cost=cost;
        System.out.println("Three parameterized constructor is excited");
    }
    void display(){
        System.out.println("Display method is entered");
        System.out.println(name);
        System.out.println(color);
        System.out.println(cost);
        System.out.println("Display method is excited");

    }
}
public class NonStaticBlock1{
    public static void main(String[] args) {
        Dog d=new Dog();
        d.display();
        Dog d1=new Dog("alex","black",10000);
        d1.display();

        
    }
}
