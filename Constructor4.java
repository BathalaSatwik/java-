class Dog{
    String name;
    String color;
    int cost;

    Dog(){  //calling the constructor with in the constructor using this method.
        name="alexy";
        color="Blacky";
        cost=10000;

    }
    Dog(String name){
        this("charlie","Black",10000);
        this.name=name;

    }
    Dog(String name,String color,int cost){
        this();
        this.name=name;
        this.color=color;
        this.cost=cost;

    }
    void display(){
        System.out.println(name);
        System.out.println(color);      
        System.out.println(cost);
    }
}
public class Constructor4{
    public static void main(String[] args) {
        Dog d1=new Dog("jacky");
        d1.display();
    }
}
