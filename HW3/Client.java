
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.rmi.PortableRemoteObject;
import java.util.*;
import java.io.*;
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
Object obj = node.lookup("comm");
TComm ro = (TComm)PortableRemoteObject.narrow(obj,
		TComm.class);

Hashtable data = ro.prtListing();
// Set keys = data.keySet();
// Iterator ptr = keys.iterator();
// while(ptr.hasNext())
// {
// 	String name = (String)ptr.next();
// 	COMM com = (COMM)data.get(name);
// 	com.prtInfo();
// }
// ro.saveData();

while(true) {
	System.out.println("1.ShowInfo\n");
	System.out.println("2.InsertRecord\n");
	System.out.println("3.DeleteRecord\n");
	System.out.println("4.UpdataRecord\n");
	System.out.println("0.Exit\n");
	int n = 0;
	Scanner input = new Scanner(System.in);
	n = input.nextInt();
	switch(n) {
		case 1 :
			Set keys = data.keySet();
			Iterator ptr = keys.iterator();
			while(ptr.hasNext()) {
				String name = (String)ptr.next();
				COMM com = (COMM)data.get(name);
				com.prtInfo();
			}
			break;
		case 2 :
			System.out.println("Please Input your name:\n");
			Scanner in = new Scanner(System.in);
			String name = in.nextLine();
			System.out.println("Please Input your qq:\n");
			Scanner inqq = new Scanner(System.in);
			String qq = inqq.nextLine();
			System.out.println("Please Input your phone:\n");
			Scanner inphone = new Scanner(System.in);
			String phone = inphone.nextLine();
			data.put(name, new COMM(name, qq, phone));
			break;
		case 3 :
			System.out.println("Please Input the name you want delete:\n");
			Scanner inde = new Scanner(System.in);
			name = inde.nextLine();
			data.remove(name);
			break;
		case 4 :
			System.out.println("Please Input the name you want update:\n");
			Scanner inup = new Scanner(System.in);
			name = inup.nextLine();
			System.out.println("Please Input your new name:\n");
			Scanner in4 = new Scanner(System.in);
			String newname = in4.nextLine();
			System.out.println("Please Input your new qq:\n");
			Scanner inqq4 = new Scanner(System.in);
			qq = inqq4.nextLine();
			System.out.println("Please Input your new phone:\n");
			Scanner inphone4 = new Scanner(System.in);
			phone = inphone4.nextLine();
			data.remove(name);
			data.put(newname, new COMM(newname, qq, phone));
			break;
		case 0 : 
			return;
	}
}
}catch(Exception ex){}
}
}
