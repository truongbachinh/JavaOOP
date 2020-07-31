
public class Student extends Person {
	private String uni;
	private String major;
	private float avgMark;
	
	public String getUni()
	{
		return uni;
	}
	public void setUni(String uni)
	{
		this.uni = uni;
	}
	public String getMajor()
	{
		return major;
	}
	public void setMajor(String major)
	{
		this.major = major;
	}
	public float getAvgMark(){
		return  avgMark;
	}
	public void setAvgMark(float avgMark) {
		this.avgMark = avgMark;
	}
	public Student()
	{
		
	}
	public Student(String uni, String major, float avgMark)
	{
		
	}
	
	@Override
	public void showInfor()
	{
		super.showInfor();
		System.out.print("\n Trường Học: " + uni + "\n Chuyên Ngành: " + major + "\n Điểm TB: " + avgMark);
	}
}
