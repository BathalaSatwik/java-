

abstract class Plane{
    abstract void takeOff();//this is the program using the OPPs concept.
    abstract void fly();
    abstract void land();
}
class PassengerPlane extends Plane{
    void takeOff(){
        System.out.println("passenger plane is taking off");
    }
    void fly(){
        System.out.println("Passsenger plane will fly at low altitude");
    }
    void land(){
        System.out.println("passenger plane will land in long runway");
    }

}
class CargoPlane extends Plane{
    void takeOff(){
        System.out.println("Cargoplane  is taking off");
    }
    void fly(){
        System.out.println("Cargoplane will fly at medium altitude");
    }
    void land(){
        System.out.println("Cargoplane will land in medium runway");
    }

}
class FighterPlane extends Plane{
    void takeOff(){
        System.out.println("Fighterplane is taking off");
    }
    void fly(){
        System.out.println("Fighterplane plane will fly at low altitude");
    }
    void land(){
        System.out.println("Fighterplane plane will land in long runway");
    }
}
class Airport{
    void permit(Plane ref){
        ref.takeOff();
        ref.fly();
        ref.land();
    }
}
public class hp2{
    public static void main(String[] args){
        PassengerPlane pp=new PassengerPlane();
        CargoPlane cp=new CargoPlane();
        FighterPlane fp=new FighterPlane();
        Airport a=new Airport();
        a.permit(pp);
        a.permit(cp);
        a.permit(fp);

    }
}
