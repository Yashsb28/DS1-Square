import java.rmi.*;
import java.rmi.server.*;

public class Serverimpl extends UnicastRemoteObject implements
        Serverintf {
    public Serverimpl() throws RemoteException {
    }

    public boolean isPalindrome(String str) throws RemoteException {
        int length = str.length();

        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - 1 - i)) {
                return false;
            }
        }

        return true;
    }

    public double square(double num) throws RemoteException{
        return num*num;
    }
    public double squareRoot(double num) throws RemoteException{
        return Math.sqrt(num);
    }

}