
package Inheritence;


public class Polymorphism {
    public static void main(String[] args) {
        ComputingSystem s1 = new Desktop("Desktop","cori3",2,500,15);
        ComputingSystem s2 = new Laptop("Laptop","cori7", 4, 1000, 20);
        ComputingSystem s3 = new MobilePhone("Mobile phone", "Duel core", 4, 16, 5);
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());
    }
}
