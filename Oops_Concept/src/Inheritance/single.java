package Inheritance;
public class single {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Tours_and_Travells
{
	int monthjan=45000;
	
}
class income extends Tours_and_Travells
{
	int monthfeb=50000;
	int profit=monthjan+monthfeb;
	public static void main (String [] args)
	{
		income obj=new income();
		System.out.println("jan month income is:"+obj.monthjan);
		System.out.println("total jan and feb income is"+obj.profit);
	}
}
