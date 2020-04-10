
package String;


public class StringBufferClass {

    public static void main(String[] args) {
         long startTime = System.currentTimeMillis();  
        
        StringBuffer sb = new StringBuffer("Java");  
        for (int i=0; i<10000; i++){  
            sb.append("Tpoint");  
        }  
        
        StringBuffer sb1 = new StringBuffer();
        sb1.append("Bangladesh");
        sb1.append(" is my motherland.");
        System.out.println(sb1);
        
        System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");  
        startTime = System.currentTimeMillis();  
    }
    
}
