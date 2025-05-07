
class Dog{
     String name;
     String color;
     int cost;

     Dog(){
        name="jacky";
        color="black";
        cost=10000;
     }
     Dog(String name){
        this.name=name;
     }
     Dog(String name,String color){
        this.name=name;
        this.color=color;
     }
     Dog(String name,String color,int cost){
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

public class StaticDog {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.display();
        Dog d1=new Dog("Charlie");
        d1.display();
        Dog d3=new Dog("rocky","black");
        d3.display();
        Dog d4=new Dog("janu","yellow",20000);
        d4.display();

        
    }
}
    

