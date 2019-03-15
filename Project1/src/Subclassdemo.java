
public class Subclassdemo extends Superclassdemo
{
	public Subclassdemo()
	{
		System.out.println("I am in Sub Class Constructor");
	}
	
	public Subclassdemo(int v)
	{
		super(v);
		System.out.println("I am in Sub Class Overloaded Constructor");
	}
	
	public static void main(String arg[])
	{
		Subclassdemo obj=new Subclassdemo();
		
		Subclassdemo obj2=new Subclassdemo(10);
	}
}
