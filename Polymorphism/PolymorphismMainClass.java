/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polymorphism;

public class PolymorphismMainClass {
    public static void main(String[] args) {
        Salary s = new Salary();
        HouseRent h = new HouseRent();
        MedicalAllowance m = new MedicalAllowance();
        getSum(s,h);
    }
}
