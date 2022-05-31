package week3.day1;

public class Students {
	int id;
	String Name;
	int PhoneNo;
	String email;
	
	public void studentInfo(int id)
	{
		this.id=id;
		System.out.println("The Student id is: " +id);
	}
	public void studentInfo(int id, String Name)
	{
		this.id=id;
		this.Name=Name;
		System.out.println("Student id: "+id);
		System.out.println("Student Name: "+Name);
	}
	public void studentInfo(String email, int PhoneNo)
	{
		this.email=email;
		this.PhoneNo=PhoneNo;
		System.out.println("Student email:" +email);
		System.out.println("Student Phone:"+PhoneNo);
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Students s=new Students();
		s.studentInfo(1001);
		s.studentInfo(1009,"Nirmalin");
		s.studentInfo("xxxx@gmail.com",78899899);

	}

}
