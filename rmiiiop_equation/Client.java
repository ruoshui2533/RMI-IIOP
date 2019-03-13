/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.rmi.PortableRemoteObject;
import java.util.Hashtable;
/**
 *
 * @author Administrator
 */
public class Client {
public static void main(String[] args)
{
    try{
Hashtable env = new Hashtable();
env.put(Context.INITIAL_CONTEXT_FACTORY,
        "com.sun.jndi.cosnaming.CNCtxFactory");
env.put(Context.PROVIDER_URL,
        "iiop://localhost:1050");
Context node = new InitialContext(env);
Object obj = node.lookup("roots");
RootInterface ro =
 (RootInterface)PortableRemoteObject.narrow(obj,
 RootInterface.class);
RootJB roots= ro.calRoots(5.7, 189.0, 7.1);
if(roots.isHasRealRoot())
{
    System.out.println("x1="+roots.getX1()+"\n"+
            "x2="+roots.getX2());
}
else
    System.out.println("This equation has no real roots.");
    }catch(Exception ex){}
}
}
