import java.util.Scanner;

public class Passenger {
    
    public static void main(String[] args) {
        System.out.println("Geneva Sign In");

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter your name:");
        String name = scan.nextLine();
        System.out.println("Hello" + name);
        scan.close();
    }
}
