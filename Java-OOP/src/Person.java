import java.util.Objects;



public class Person {
	private String fullName;
	private String address;
	private int ID;
	
	public String getFullName() {
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
		this.ID = ID;
	}
	public Person()
	{
		
	}
	public Person(String fullName, String address, int ID)
	{
		this.fullName = fullName;
		this.address = address;
		this.ID = ID;
	}
	public void showInfor()
	{
		System.out.println("-----Thông Tin");
		System.out.print(" ID: " + ID + "\n Tên Đầy Đủ: " + fullName + "\n Địa Chỉ: " + address);
	}
	@Override
	public boolean equals(Object objOther)
	{
		if(this == objOther)
			return true;
		if(objOther == null)
		{
			return false;
		}
		if(this.getClass() != objOther.getClass())
		{
			return false;
		}
//		if(!(objOther instanceof Person))// khoong cho cac lop con override caif daawtj public final
//		{
//			return false; // khoong ch
//		}
		Person other = (Person) objOther;
		if(
		 	this.ID == other.ID
			&& Objects.equals(fullName, other.fullName)
			&& Objects.equals(address, other.address))
		{
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args)
	{
		System.out.println("\n");
		System.out.println("\n");
		Person ps1 = new Student("Trương Bá Chính", "Thanh Hóa", 1);
		Person ps2 = new Student("Trương Bá Chính", "Thanh Hóa", 1);
		Person ps3 = new Student("Trương Bá Chung", "Hà Nội", 2);
		
		System.out.println("Person 1 == Person 2 " + ps1.equals(ps2));//true
		System.out.println("Person 1 == Person 1 " + ps1.equals(ps1));//true
		System.out.println("Person 1 == Person 3 " + ps1.equals(ps3));//false
		System.out.println("Person 2 == Person 3 " + ps2.equals(ps3));//false
	}
}
	
