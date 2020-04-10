
package SomeLogicalCode;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentDate {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        System.out.println();
        DateFormat dateFormat = new SimpleDateFormat("dd - MM - YYYY");
        System.out.println(dateFormat.format(date));
        
        
    }
}
