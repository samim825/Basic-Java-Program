
package SomeLogicalCode;

import java.util.Scanner;


public class MultiplicationTable {
    public static void main(String[] args) {
       int a;
        Scanner mt = new Scanner(System.in);
         do{          
            System.out.println("Enter the Number for which you want Multiplication Table : ");
        int n = mt.nextInt();
        System.out.println("The multiplication Table of "+n+" is given below.");
        for(int i=1 ; i<=n; i++)
            System.out.println(n +"*"+i +"="+ i*n);
        System.out.println("Press 0 to break.\nPress 1 to continue.");
        
        a = mt.nextInt();
         }while(a==1);

    }
    
}
