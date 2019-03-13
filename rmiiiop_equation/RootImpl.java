/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.rmi.RemoteException;
import javax.rmi.PortableRemoteObject;
/**
 *
 * @author Administrator
 */
public class RootImpl 
        extends PortableRemoteObject 
        implements RootInterface
{

    public RootImpl() throws RemoteException {
        super();
    }

    public RootJB calRoots(double a, double b, double c) throws RemoteException {
        double delta,x1,x2;
        delta = b*b-4*a*c;
        RootJB roots = new RootJB();
        if(delta<0)
        {
            roots.setHasRealRoot(false);
        }
        else
        {
            x1=(-b+Math.sqrt(delta))/(2*a);
            x2=(-b-Math.sqrt(delta))/(2*a);
            roots.setX1(x1);
            roots.setX2(x2);
            roots.setHasRealRoot(true);
        }
return roots;
    }


}
