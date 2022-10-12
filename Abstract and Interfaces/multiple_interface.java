/******************************************************************************
multiple interface

*******************************************************************************/

interface ByCycle{
    int a=45;
    void applyBrake(int decrement);
    void speedUp(int increment);
    
}

interface HornType{
    void largeHorn();
    void smallHorn();
}

class MyCyle implements ByCycle, HornType{
    public void applyBrake(int decrement)
    {
        System.out.println("Apply Brake");
    }
    
    public void speedUp(int increment)
    {
        System.out.println("Increase speed");
    }
    
    public void largeHorn(){System.out.println("Please, press large horn");}
    public void smallHorn(){System.out.println("Please, press small horn");}
}

public class Main
{
	public static void main(String[] args) {
	MyCyle obj = new MyCyle();
	obj.applyBrake(1);
	obj.speedUp(1);
	// obj.a=46;  cannot assign a value to final variable a
	// you can create properties in interfaces
	System.out.println(obj.a);
	obj.largeHorn();
    obj.smallHorn();
	}
}
