
package String;

public class StringClass {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        String s = "I'm a ";
        String concat = s.concat("student");
        System.out.println(s);
        
        String s1 = "Dhaka ";
        s1 = s1+"Bangladesh";
        s1 = s1 +"I'm a university student.";
        System.out.println(s1);
        
        String t = "Java";  
        for (int i=0; i<10000; i++){  
            t = t + "Tpoint"; 
            } 
        
         System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");  
        startTime = System.currentTimeMillis(); 
        
        System.out.println(System.currentTimeMillis());
    }   
    }  

