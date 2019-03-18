import java.io.Serializable;
public class COMM implements Serializable
{
private String name,qq,phone;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getQq() {
	return qq;
}

public void setQq(String qq) {
	this.qq = qq;
}


public COMM(String name, String qq, String phone) {
	super();
	this.name = name;
	this.qq = qq;
	this.phone = phone;
}


public COMM() {
	super();
	// TODO Auto-generated constructor stub
}

public String getPhone() {
	return phone;
}

public void setPhone(String phone) {
	this.phone = phone;
}
public void prtInfo()
{
	System.out.printf("%20s%20s%20s\n",
			this.name,this.qq,this.phone);
}
}
