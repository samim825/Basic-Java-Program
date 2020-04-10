
package BasicJavaOOPProgram;


public class Encapsulation {
    private String name;
    private int age;
    
    public Encapsulation(String name, int age){
        this.name = name;
        this.age = age;
    }
    public Encapsulation(){
        
    }

    public void getAge() {
        System.out.println(age);
    }

    public void printInfo(){
        System.out.println("Name : " +name);
        System.out.println("Age : " +age);
    }
    
}
