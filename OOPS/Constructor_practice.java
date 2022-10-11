/******************************************************************************
Get height and radius for cylinder

*******************************************************************************/
class Cylinder{
    private int height;
    private int radius;
    
    public void setHeight(int height)
    {
        this.height = height;
    }
     public int getHeight(){
         return height;
     }
    
    public void setRadius(int radius)
    {
        this.radius = radius;
    }
    
    public int getRadius(){
        return radius;
    }
}

public class Main
{
	public static void main(String[] args) {
	    Cylinder cy1 = new Cylinder();
	     cy1.setHeight(100);
	     cy1.setRadius(25);
	     
	     System.out.println("Height of cylinder is " + cy1.getHeight());
	     System.out.println("Radius of cylinder is " + cy1.getRadius());
		
	}
}
