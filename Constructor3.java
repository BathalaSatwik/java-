class Dog{
    String name;
    String color;
    int cost;

    Dog(){  //writing a three and zero parameterized constructor in one program. 
        name="Charlie";
        color="black";
        cost=10000;
    }
    Dog(String name,String color,int cost){
        this.name=name;
       this. color=color;
        this.cost=cost;
    }
    void display(){
        System.out.println(name);
        System.out.println(color);
        System.out.println(cost);
    }
}
public class Constructor3{
    public static void main(String[] args){
        Dog d=new Dog();
        d.display();
        Dog d1=new Dog("alexy","Black",1000);
        d1.display();

    }
}