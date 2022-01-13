/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my_shop;
import java.time.*;
import java.time.format.*;


/**
 *
 * @author Abrar Faiyaz Khan
 */
public class DateTime {
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd,MM,yyyy");
    LocalDateTime now = LocalDateTime.now();
//        System.out.println(dtf.format(now));
        
    String time = (String)dtf.format(now);
//        System.out.println(time);
    public String getDTM() {
        return time;
    }
}
