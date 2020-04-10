
package Polymorphism;


public class Salary {
    public String name = "Basic salary ";
    public int amount = 8000;
    
    public int getAmount(){
        return this.amount;
    }
    public int getSum(int s1 , int s2){
        return s1.getAmount() +s2.getAmount();
    }
    public Salary(){
        
    }
}
