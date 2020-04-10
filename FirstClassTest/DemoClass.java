
package FirstClassTest;

public abstract class DemoClass {
    private static String collegeName = "Savar Model College ";
    private int roll;
    private String name;
    
    public String getCollegeName(){
        return collegeName;
    }
    public void serRoll(int roll){
        this.roll = roll;
    }
    public int getRoll(){
        return roll;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return  name;
    }
    
    public void printInfo(){
        System.out.println("Roll = "+roll+" and Name = "+name+" .");
    }
    public DemoClass(){
        
    }
    public DemoClass(int rool,String name){
        this.roll = rool;
        this.name = name;
    }
}
