package Inheritance;

class fruits
{
void Mango()
{
	System.out.println("King of Fruits is mango");
}
}
class banana extends fruits
{
	void tasty()
	{
	
		System.out.println("banana is tasty");
		
	}
}


public class Single_Inhertance {

	public static void main(String[] args) {
	banana bn=new banana();
		bn.Mango();
		
		bn.tasty();
	    
		

	}

}
