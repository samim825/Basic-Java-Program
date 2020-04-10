package BasicJavaOOPProgram;

public class Circle {
    public double radious;
    public void setRadius(double radious){
        this.radious = radious;
    }
    public void printArea(){
        System.out.println("The area of Circle is : "+radious*radious*Math.PI);
    }
    public void printPerimeter(){
        System.out.println();
         System.out.println("The Perimeter of Circle is:  "+ 2*radious*Math.PI);
         System.out.println();
    }
    Circle(double radious){
        this.radious=radious;
    }
    public static void main(String[] args){
        Circle cr = new Circle(10);
        cr.printArea();
        cr.printPerimeter();
        
        Circle cr1 = new Circle(20);
        cr1.printArea();
        cr1.printPerimeter();
        
    }
}
