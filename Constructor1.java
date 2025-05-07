class Dog{
     String name;
     String color;
     int cost;
     
    Dog(String name,String color,int cost){ //By using the this variable we can overcome the shadowing
       this.name=name;      /*shadowing problem occurs because the 
                           instance variable name and local variable name is same*/
       this. color=color;
       this. cost=cost;
    }
    void display(){
        System.out.println(name);
        System.out.println(color);
        System.out.println(cost);
    }
}
public class Constructor1{
    public static void main(String[] args) {
        Dog d1=new Dog("balcky","balck",10000);
        d1.display();
        
    }
}
