/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BasicJavaOOPProgram;


public class Department {
    public static String VCName= "Professor Dr. Mohammad Alauddin";
    public String deptName = "This is a model Department Name." ;
    public static int classRoom = 5;
    public int teacher = 50;
    public int students = 250;
    
    public void setStudents(int students){
        this.students = students;
    }
    public void getDeptName(){
        System.out.println("Department Name : "+ deptName); 
    }
    
    public void getInfoOfTheDept(){
        System.out.println("VC Name : "+VCName);
        System.out.println("Department Name : " + deptName);
        System.out.println("Students : " + students);
        System.out.println("Teacher : " + teacher);
        System.out.println("Class Room : " + classRoom);
        
    }

    public Department(String deptName,int classRoom,int teacher,int students) {
        this.deptName = deptName;
        this.classRoom = classRoom;
        this.students = students;
        this.teacher = teacher;
    }


    
    
}
