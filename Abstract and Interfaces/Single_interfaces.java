/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

interface ByCycle{
    int a=45;
    void applyBrake(int decrement);
    void speedUp(int increment);
    
}

class MyCyle implements ByCycle{
    public void applyBrake(int decrement)
    {
        System.out.println("Apply Brake");
    }
    
    public void speedUp(int increment)
    {
        System.out.println("Increase speed");
    }
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
	}
}
