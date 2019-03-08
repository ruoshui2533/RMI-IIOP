//HelloInterface.java
import java.rmi.Remote;

public interface HelloInterface extends java.rmi.Remote {
  public void sayHello() throws java.rmi.RemoteException;
}
