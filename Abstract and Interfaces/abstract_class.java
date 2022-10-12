/******************************************************************************
abstract class

*******************************************************************************/

abstract class Base{
    public Base(){
        System.out.println("I am constructor for Base");
    }
    
    public void sayHello(){
        System.out.println("Hello");
    }
    
    abstract public void greet();
}

class Derived extends Base{
    public void greet()
    {
        System.out.println("Good Morning");
    }
}

public class Main
{
	public static void main(String[] args) {
	Base obj = new Derived();
	obj.sayHello();
	obj.greet();
		
	}
}
