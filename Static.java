package vivek;
class Students{
    int roll;
    String name;
    int marks;
    int yop;
    
    void display(){
        System.out.println("Roll: "+roll+"Name: "+name+"marks: "+marks+"yop: "+yop);
    }
}

public class Static {
	    public static void main(String [] args){
	        Students stud=new Students();
	        stud.roll=1;
	        stud.name="Satwik";
	        stud.marks=89;
	        stud.yop=2025;
	        Students stud1=new Students();
	        stud1.roll=2;
	        stud1.name="vivek";
	        stud1.marks=99;
	        stud1.yop=2025;
	        stud.display();
	        stud1.display();
}
	}
