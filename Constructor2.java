class Dog{
    String name;
    String color;
    int cost;
              //this program the compiler will create defalut zero parameterized constructor.

  void display(){  
    System.out.println(name);
    System.out.println(color);
    System.out.println(cost);
  }

}
public class Constructor2{
    public static void main(String[] args){
        Dog d=new Dog();
        d.display();


    }
}