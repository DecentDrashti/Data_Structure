import java.util.*;
public class Student_Details{
    int enrollment_no;
    String name;
    int semester;
    double cpi;
    public Student_Details(int enrollment_no,String name,int semester,double cpi){
        this.enrollment_no=enrollment_no;
        this.name=name;
        this.semester=semester;
        this.cpi=cpi;
    }
    public void display(){
        for(int i=0;i<5;i++){
        System.out.println("Enrollment_No:"+enrollment_no+"\nName:"+name+"\nSemester:"+semester+"\ncpi:"+cpi);
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++){
        System.out.println("enter the details of Student"+i);
        System.out.println("enter the enrollment number:");
        int enrollment_no=sc.nextInt();
        System.out.println("enter the name:");
        String name=sc.next();
        System.out.println("enter the semester:");
        int semester=sc.nextInt();
        System.out.println("enter the cpi");
        double cpi=sc.nextDouble();
        student[i]=new Student_Details(enrollment_no,name,semester,cpi);
        }
        
        System.out.println();
        System.out.println("Student Details are as follows:-");
        for(int i=0;i<5;i++){
        student[i].display();
        }
    }
    
}
