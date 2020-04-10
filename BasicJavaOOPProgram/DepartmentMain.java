/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BasicJavaOOPProgram;


public class DepartmentMain {
    public static void main(String[] args) {
        Department ict = new Department("ICT",5,20,300);
        ict.getInfoOfTheDept();
        ict.setStudents(500);
        ict.getInfoOfTheDept();
        ict.getDeptName();
        Department cse = new Department("CSE", 6, 15, 200);
        cse.getInfoOfTheDept();
        Department te = new Department("Textile", 3, 15, 200);
        te.getInfoOfTheDept();
    }
}
