
package javaExceptionHandeling;


public class primaryStage {
    public static void main(String[] args) {
       int a=15;
       int b=0;
       int result = 0;
        try {
            result = divide(a,b);
        } catch (ArithmeticException e) {
            System.out.println("You can't divide "+a+" by "+b);
        }
     System.out.println("The result is : "+result);
    }
        
        
         public static int divide(int a,int b){
        return a/b;
    }
}
