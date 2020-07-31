package abstractJava;

import java.util.Objects;

public abstract class Person {
	private String fullName;
	private String address;
	private int ID;
	
	public  String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName)
	{
		this.fullName = fullName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address)
	{
		this.address= address;
	}
	public int getId(int ID)
	{
		return ID;
	}
	public void setId(int ID)
	{
		this.setID(ID);
	}
	public Person()
	{
		
	}
	public Person(String fullName, String address, int ID)
	{
		this.fullName = fullName;
		this.address = address;
		this.setID(ID);
	}
	public abstract void showInfor();
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	@Override
	public boolean equals(Object ob)
	{
		if(this == ob)
			return true;
		if(ob == null)
		{
			return false;
		}
		if(this.getClass() != ob.getClass())
		{
			return false;
		}
		Person other = (Person) ob;
		return Objects.equals(ID, other.ID)
			&& Objects.equals(fullName, other.fullName)
			&& Objects.equals(address, other.fullName);
		
	}
	
	
}
