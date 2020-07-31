

public class KhoiTaoDoiTuong {
	public static void main(String[] args)
	{
		Person ps = new Person();
		Student st = new Student();
		Employee ep = new Employee();
		System.out.println("\n");
		ps.setFullName("Trương Bá Chính");
		ps.setAddress("Thanh Hóa");
		ps.showInfor();
		System.out.println("\n");
		st.setFullName("Trương Bá Chính");
		st.setAddress("Thanh Hóa");
		st.setUni("Đại học Greenwich");
		st.setMajor("Công Nghệ Thông Tin");
		st.setAvgMark(6.5f);
		ps = st;
		ps.showInfor();
		System.out.println("\n");
		ep.setFullName("Trương Bá Chính");
		ep.setAddress("Thanh Hóa");
		ep.setComp("Null ");
		ep.setPosition("Công Ăn Lương");
		ep.setSalary(1000000000f);
		ps = ep;
		ps.showInfor();
//		System.out.println("\n");
//		Person[] psArray = new Person[3];
//		psArray[0] = st;
//		psArray[1] = ps;
//		psArray[2] = ep;
//		for(Person element : psArray)
//		{
//			
//			element.showInfor();
//		}
		
		
		
		
		
	}

}
