import java.util.Objects;

public class Employee extends Person {
	private String comp;
	private String position;
	private float salary;
	
	public String getComp()
	{
		return comp;
	}
	public void setComp(String comp)
	{
		this.comp = comp;
	}
	public String getPosition()
	{
		return position;
	}
	public void setPosition(String position)
	{
		this.position = position;
	}
	public float getSalary(){
		return  salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public Employee()
	{
		
	}
	public Employee(String comp, String position, float salary)
	{
		
	}
	
	@Override
	public void showInfor()
	{
		super.showInfor();
		System.out.print("\n Công Ty: " + comp + "\n Chức vụ: " + position + "\n Lương: " + salary);
	}
	@Override
	public boolean equals(Object ob)
	{
		if(!super.equals(ob))
		{
			return false;
		}
		Employee ep1 = (Employee) ob;
		return salary == ep1.salary
			&&	Objects.equals(comp, ep1.comp)
			&& Objects.equals(position, ep1.position);
		
		
		
	}
	
	
}
