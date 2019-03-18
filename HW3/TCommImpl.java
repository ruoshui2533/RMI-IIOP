import java.rmi.RemoteException;
import java.util.Hashtable;
import java.util.Map;
import javax.rmi.PortableRemoteObject;
import java.io.*;
public class TCommImpl extends PortableRemoteObject 
implements TComm
{
private Hashtable data = new Hashtable();
public void setData() {
	data.put("zhu ting", new COMM("zhu ting","123456","15392564"));
	data.put("zhang ting", new COMM("zhang ting","123456","15392564"));
}

public Hashtable getData() {
	return data;
}

public void setData(Hashtable data) {
	this.data = data;
}

public TCommImpl() throws RemoteException {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public Hashtable prtListing() throws RemoteException {
	// TODO Auto-generated method stub
	this.setData();
	return this.getData();
}

@Override
public void saveData() throws RemoteException {
	// TODO Auto-generated method stub
	try {
		FileOutputStream fos =
				new FileOutputStream("C:\\Users\\78475\\Documents\\Tencent Files\\784758950\\FileRecv\\HW3\\RMIIIOPApp\\src\\org\\mid\\hw3\\comm.data");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(this.data);
		oos.flush();
		oos.close();
		fos.close();
	}catch(Exception ex){}
}

// @Override
// public void loadData() throws RemoteException {
// 	// TODO Auto-generated method stub
	
// }

// @Override
// public void inertRecord(String name, String qq, String phone)
// 		throws RemoteException {
// 	// TODO Auto-generated method stub
	
// }

// @Override
// public void deleteRecord(String name) throws RemoteException {
// 	// TODO Auto-generated method stub
	
// }

// @Override
// public void updateRecord(String name, String qq, String phone)
// 		throws RemoteException {
// 	// TODO Auto-generated method stub
	
// }

}
