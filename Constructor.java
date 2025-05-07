class Dog{
    String name;
    String color;
    int cost;

    Dog(){
        name="charlie";
        color="Blue";
        cost=10000;
    }
     void display(){
        System.out.println(name);
        System.out.println(color);
        System.out.println(cost);

    }
}
public class Constructor { //My first constructor program
    public static void main(String[] args) {
        Dog d=new Dog();
        d.display();
        
    }
}

