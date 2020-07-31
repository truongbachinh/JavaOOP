
public class TestEquals {
	public static void main(String[] args)
	{
		System.out.println("\n");
		System.out.println("\n");
		Person ps1 = new Student("Trương Bá Chính", "Thanh Hóa", 1);
		Person ps2 = new Student("Trương Bá Chính", "Thanh Hóa", 1);
		Person ps3 = new Student();
		
		System.out.println("Person 1 == Person 2 " + ps1.equals(ps2));//true
		System.out.println("Person 1 == Person 1 " + ps1.equals(ps1));//true
		System.out.println("Person 1 == Person 3 " + ps1.equals(ps3));//false
		System.out.println("Person 2 == Person 3 " + ps2.equals(ps3));//false
	}

}
