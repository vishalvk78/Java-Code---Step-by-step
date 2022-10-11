/******************************************************************************
Get height and radius for cylinder

*******************************************************************************/
class Cylinder{
    private int height;
    private int radius;
    private int num;
    
    void setHeight(int height)
    {
        this.height = height;
    }
     int getHeight(){
         return height;
     }
    
    void setRadius(int radius)
    {
        this.radius = radius;
    }
    
    int getRadius(){
        return radius;
    }
    
    void setNum(int num)
    {
        this.num = num;
    }
    
    int getNum(){
        return num;
    }
    
    Cylinder()
    {
        System.out.println("There is no any value giver for cylinder");
    }
    
    Cylinder(int height, int radius)
    {
        this.height = height;
        this.radius = radius;
        
    }
    
    Cylinder(int height, int radius, int num)
    {
        this.height = height;
        this.radius = radius;
        this.num = num;
        
    }
}

public class Main
{
	public static void main(String[] args) {
	    Cylinder cy1 = new Cylinder(100, 25);
	    Cylinder cy3 = new Cylinder(100, 25, 10);
	     
	     
	     System.out.println("Height of cylinder is " + cy1.getHeight());
	     System.out.println("Radius of cylinder is " + cy1.getRadius());
	     System.out.println("Height of cylinder is " + cy3.getHeight());
	     System.out.println("Radius of cylinder is " + cy3.getRadius());
	     System.out.println("Given number is " + cy3.getNum());
		
	}
}
