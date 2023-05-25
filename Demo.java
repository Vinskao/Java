import java.time.LocalDate;
import java.util.jar.Attributes.Name;

import javax.swing.LayoutStyle;

public class Demo {
    public static void main(String[] args){
        System.out.println("Da!");
        //int
        long flightNumber = 1000;
        flightNumber = flightNumber + 1;
        System.out.println(flightNumber);
        //float type, double type; float is not accurate; 32 bits float; 64 bits double
        double total = 10d;
        //boolean variables
        int tits = 5;
        boolean bra = tits > 3;
        System.out.println(bra);
        //string variables, string is a class, first letter is uppercase
        String label = "king:";
        String firstname = "m" ;
        String lastname = "kao";
        System.out.println(label + firstname + lastname);
        LocalDate invoiceLocalDate = LocalDate.now();
        System.out.println(invoiceLocalDate);
    }
}


