/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SomeLogicalCode;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class LocalTime {
    public static void main(String[] args) {
        Date time =new Date();
        System.out.println(time+"\n");
        DateFormat timeFormat = new SimpleDateFormat("hh :mm :ss");
        String LocalTime = timeFormat.format(time);
        System.out.println(LocalTime);
    }
   
}
