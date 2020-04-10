
package javaExceptionHandeling;


public class ArrayException {
    public static void main(String[] args) {
        int a[] = new int[10];
        
        a[0] = 10;
        a[1] = 12;
        a[2] = 10;
        a[3] = 12;
        a[4] = 10;
        a[5] = 12;
        a[6] = 10;
        a[7] = 12;
        
        try {
            for(int i = 0; i<=15;i++){
            System.out.println(a[i]);
        }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array out of index. In this index  "+"there is no data.");
        }
    }
}
