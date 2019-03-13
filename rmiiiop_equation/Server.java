/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.naming.Context;
import javax.naming.InitialContext;
/**
 *
 * @author Administrator
 */
public class Server {
public static void main(String[] args)
{
    try{
System.setProperty("java.naming.factory.initial",
        "com.sun.jndi.cosnaming.CNCtxFactory");
System.setProperty("java.naming.provider.url",
        "iiop://localhost:1050");
Context node = new InitialContext();
node.rebind("roots", new RootImpl());
System.out.println("Server is running.....");
    }catch(Exception ex){}


}
}
