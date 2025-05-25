package vivek;
class Studs{
    int roll;//here the yop is sharing among the multiple objects so we can declare it as static 
    String name;
    int marks;
    static int yop=2025;
    
    void display(){
        System.out.println("Roll: "+roll+"Name: "+name+"marks: "+marks+"yop: "+yop);
    }
}

public class Static1 {
	    public static void main(String [] args){
	        Studs stud=new Studs();
	        stud.roll=1;
	        stud.name="Satwik";
	        stud.marks=89;
	        Studs stud1=new Studs();
	        stud1.roll=2;
	        stud1.name="vivek";
	        stud1.marks=99;
	        stud.display();
	        stud1.display();
}
	}
