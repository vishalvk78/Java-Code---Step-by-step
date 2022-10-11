/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Base{
    int x;
    
    public void setBase(int x)
    {
        System.out.println("I am base class");
        this.x = x;
    }
    
    public int getBase(){
        return x;
    }
  
}
    class Derived extends Base{
        int y;
        
        public void setDerived(int y)
        {
            System.out.println("I am Derived class");
            this.y = y;
        }
        
        public int getDerived(){
            return y;
        }
    }

public class Main
{
	public static void main(String[] args) {
		
		Base b = new Base();
		Derived d = new Derived();
		
		 b.setBase(10);
		 d.setDerived(50);
		 System.out.println(b.getBase());
		 
		 System.out.println();
		 
		 System.out.println(d.getDerived());
		 
		 
	}
}
