/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstraction;

/**
 *
 * @author Perfect
 */
public abstract class Department {
    public static String VCName= "Professor Dr. Mohammad Alauddin";
    public String deptName = "This is a model Department Name." ;
    public int classRoom = 5;
    public int teacher = 50;
    public int students = 250;
    
    public void students(){
        System.out.println("Studens : "+students);
    }
    public void teacher(){
        
    }


    
    
}

