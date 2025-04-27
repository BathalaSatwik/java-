class Dog{
   String name;
   int cost;
   String color;
    void eat(){
      System.out.println("Dog is eating");
    }
    void sleep(){
      System.out.println("Dog is sleeping");
    }    
    void bark(){
      System.out.println("Dog is sleeping");
    }

}
public class Object{
   public static void main(String[] args){
      Dog d1=new Dog();
      d1.eat();
      d1.sleep();
      d1.bark();

      Dog d2=new Dog();
      d2.name="jacky";
      d2.cost=2300;
      d2.color="black";
      System.out.println(d2.name);
      System.out.println(d2.cost);
      System.out.println(d2.color);
   }
}