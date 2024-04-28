import java.rmi.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            String serverURL = "rmi://localhost/Server";
            Serverintf serverintf = (Serverintf) Naming.lookup(serverURL);
            System.out.print("Enter Your Number ");
            double num = sc.nextDouble();
            
            System.out.println(" ------------------- Results-------------------");
           
        
            System.out.println("Square of number : " + serverintf.square(num));
            System.out.println("Square Root of number : " + serverintf.squareRoot(num));
           

        } catch (Exception e) {
            System.out.println("Exception Occurred at Client!" + e.getMessage());
        }
    }
}


//javac  *.java
//rmiregistry
//java Server
// java Client
