/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BasicJavaOOPProgram;

public class MyClass {

    String a;

    public MyClass(String ab) {
        this.a = ab;
    }

    public boolean equals(Object object2) {
        if(a == object2) { 
            return true;
        }
        else return false;
    }

    public boolean equals2(Object object2) {
        if(a.equals(object2)) {
            return true;
        }
        else return false;
    }



    public static void main(String[] args) {

        MyClass object1 = new MyClass("test");
        MyClass object2 = new MyClass("test");

        object1.equals(object2);
        System.out.println(object1.equals(object2));

        object1.equals2(object2);
        System.out.println(object1.equals2(object2));
    }


}
