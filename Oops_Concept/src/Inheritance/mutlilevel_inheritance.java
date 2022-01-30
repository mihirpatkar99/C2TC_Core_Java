package Inheritance;


class score
{
	public score()
	{
		System.out.println("passing grade of student ");
	}
	public void per()
	{
		System.out.println("to apply mnc per should be above 60");
	}
	
}
class pass extends score
{
	public pass()
	{
		System.out.println("(per <=100 && per>=60)=pass");
	}
	public void marks1()
	{
		System.out.println("above 60 is good");
	}
}
class fail extends pass
{
	public fail()
	{
		System.out.println("(per<=60=)fail");
	}
	public void marks()
	{
		System.out.println("below 60 is == fail in MNC's");
	}
}

public class mutlilevel_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fail f=new fail();
		f.per();
		f.marks1();
		f.marks();
		
		

	}

}