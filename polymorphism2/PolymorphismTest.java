
package polymorphism2;


public class PolymorphismTest {
    public static void main(String[] args) {
        Animal cow = new Cow();
        Animal human = new Human();
        cow.eat();
        human.eat();
       
    }
}
