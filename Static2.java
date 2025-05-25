package vivek;
class Student1{
    int roll; 
    String name;
    int marks;
    static int yop=2025; //definig how to access the instance variables in static method.
    
    static void alex(Student1 stud) {
    	System.out.println("Roll: "+stud.roll+"Name: "+stud.name+"marks: "+stud.marks+"yop: "+yop);
    	
    	
    }
    
    void display(){
        System.out.println("Roll: "+roll+"Name: "+name+"marks: "+marks+"yop: "+yop);
    }
}

public class Static2 {
	    public static void main(String [] args){
	        Student1 stud=new Student1();
	        stud.roll=1;
	        stud.name="Satwik";
	        stud.marks=89;
	        Studs stud1=new Studs();
	        stud1.roll=2;
	        stud1.name="vivek";
	        stud1.marks=99;
	        stud.display();
	        stud1.display();
	        Student1.alex(stud);
}
	}
