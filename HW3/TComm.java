import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Hashtable;
public interface TComm extends Remote
{
     public Hashtable prtListing() throws RemoteException;
     public void saveData() throws RemoteException;
     // public void loadData() throws RemoteException;
     // public void inertRecord(String name,String qq,String phone)throws RemoteException;
     // public void deleteRecord(String name) throws RemoteException;
     // public void updateRecord(String name,String qq,String phone)throws RemoteException;
}
