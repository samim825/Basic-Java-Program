
package Inheritence;


public class InheritanceTest {
    public static void main(String[] args){
        Desktop desktop = new Desktop("Desktop","cori3",2,500,15);
        System.out.println(desktop);
        Laptop laptop = new Laptop("Laptop","cori5", 4,1000, 14);
        System.out.println(laptop);
        MobilePhone mobilePhone = new MobilePhone("Samsung","cori3",2,500,15);
        System.out.println(mobilePhone);
    }
}
