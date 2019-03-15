
public class Usercalculator implements Calculator
{
public int add(int var1,int var2)
{
	return var1+var2;
}
public int sub(int var1,int var2)
{
	return var1-var2;
}
public int multi(int var1,int var2)
{
	return var1*var2;
}
public void display()
{
	System.out.println("add:"+add(10,20));
	System.out.println("sub:"+sub(20,10));
	System.out.println("multi:"+multi(20,20));

	}
public static void  main(String arg[])
{
	Usercalculator calobj=new Usercalculator();
	calobj.display();
}
}