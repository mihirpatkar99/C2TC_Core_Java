package Inheritance;


class MPSC_PSI_EXAM
{
	public MPSC_PSI_EXAM()
	{
System.out.println("Steps to crack psi exam");	
	}

}
class prelims extends MPSC_PSI_EXAM
{
	public prelims()
	{
		System.out.println("1 step of exam");
	}
	public void marks()
	{
		System.out.println("100 marks exam for prelium");
	}
}
class main_exam extends MPSC_PSI_EXAM
{
	public main_exam()
	{
		System.out.println("2nd step of exam");
	}
	public void papers()
	{
		System.out.println("divided into 2 papers 0f 200 marks each i.e=400 marks");
	}
}
class physical extends MPSC_PSI_EXAM
{
	public physical()
	{
		System.out.println("3rd step of exam");
	}
	public void ground()
	{
		System.out.println("Physical round of 100 marks");
	}
}
class interview extends MPSC_PSI_EXAM
{
	public interview()
	{
		System.out.println("last  step of exam");
	}
	public void last_step_of_selection()
	{
		System.out.println("interview round of 40 marks");	
	}
}
public class Herarchical_inheritance {

	public static void main(String[] args)
	{
		//prelims pr=new prelims();
		//pr.marks();
		
		//main_exam main=new main_exam();
		//main.papers();
		
		//physical py= new physical();
		//py.ground();
		
		interview iv=new interview();
		iv.last_step_of_selection();
		

}
}
