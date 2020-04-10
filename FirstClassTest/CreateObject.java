
package FirstClassTest;

public class CreateObject {
    public static void main(String[] args) {
        DemoClass stu = new DemoClassInherit(141326," Samim"," Dhaka");
        stu.printInfo();
        DemoClass stu1 = new DemoClassInherit(141325, " Shanto"," Tangail");
        stu1.printInfo();
        DemoClass stu2 = new DemoClassInherit(141324, " Sohan"," Rangpur");
        stu2.printInfo();
        
    }
}
