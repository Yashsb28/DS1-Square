import java.rmi.*;

interface Serverintf extends Remote {

    public boolean isPalindrome(String str) throws RemoteException;
    public double square(double num) throws RemoteException;
    public double squareRoot(double num) throws RemoteException;
}