
class Plane{
    void takeOff(){//stepls of learning the inheritance with
        System.out.println("PLane is taking off");  
    }
    void fly(){
        System.out.println("Plane is flying");
    }
    void land(){
        System.out.println("Plane is landing");
    }
}
class Passangerplane extends Plane{
    void takeOff(){
        System.out.println("Passangerplane is taking off");
    }
    void fly(){
        System.out.println("passanger Plane is flying");
    }
    void land(){
        System.out.println("Passanger plane is landing");
    }
}
class Fighterplane{
    void takeOff(){
        System.out.println("Fighter plane is taking off");
    }
    void fly(){
        System.out.println("Fighter plane is flys at high altitude");
    }
    void land(){
        System.out.println("Fighter plane is landing");
    }
}
class Cargoplane{
    void takeOff(){
        System.out.println("Cargo plane i flying");
    }
    void fly(){
        System.out.println("Cargp plane flys at medium altitude");
    }
    void land(){
        System.out.println("Cargo plane is landing");
    }
}
public class Hp{
    public static void main(String[] args) {
        Plane p=new Plane();
        Passangerplane pp=new Passangerplane();
        Fighterplane fp=new Fighterplane();
        Cargoplane cp=new Cargoplane();

        p.takeOff();
        p.fly();
        p.land();
         pp.takeOff();
        pp.fly();
        pp.land();
         fp.takeOff();
        fp.fly();
        fp.land();
         cp.takeOff();
        cp.fly();
        cp.land();



        
    }
}
