class Dog{
    String  name;
    String color;
    int cost;
    static int count=0;//counting the number of objects using the static variable
                       //if we don't declare the count as static we will get the output as 1,1,1,1 like how many objects are there.
    Dog(){
        count ++;
        name="alex";
        color="black";
        cost=1000;
    }
    Dog(String name, String color, int cost){
        count ++;
        this.name=name;
        this.color=color;
        this.cost=cost;
    }
    
}
public class Countingobjects{
    public static void main(String[] args){
        Dog d=new Dog();
        System.out.println(Dog.count);
        Dog d1=new Dog();
        System.out.println(Dog.count);
        Dog d2=new Dog();
        System.out.println(Dog.count);
    }
}