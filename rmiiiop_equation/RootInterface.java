/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.rmi.Remote;
import java.rmi.RemoteException;
/**
 *
 * @author Administrator
 */
public interface RootInterface 
        extends Remote
{
public RootJB calRoots(double a,double b, double c)
        throws RemoteException;
}
