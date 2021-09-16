
package kata01_42;

import java.util.Date;



public class Main {
    
    public static void main(String[] args) {
        
        Person person = new Person("Airam", new Date(101, 6, 31));
        
        
        System.out.println(person.getName() + " tiene " + person.getAge() + " años.");
        
    }


}
