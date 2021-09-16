
package kata01_42;

import java.util.Calendar;
import java.util.GregorianCalendar;



public class Main {
    
    public static void main(String[] args) {
        
        Calendar birthdate = GregorianCalendar.getInstance();
        birthdate.set(2001, 7, 31);
        Person person = new Person("Airam", birthdate);
        
        
        System.out.println(person.getName() + " tiene " + person.getAge() + " años.");
        
    }


}
