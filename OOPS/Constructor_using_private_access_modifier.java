/******************************************************************************
Constructor using private access modifier

*******************************************************************************/

class Employee
{
    private String name;
    private int salary;
    
    public void setName(String n)
    {
        name = n;
    }
    
    public String getName(){ return name; }
    
    public void setSalary(int m)
    {
        salary = m;
    }
    
    public int getSalary(){return salary;}
    
    
    //declare constructor
    public Employee(String myName, int mySalary){
        name = myName;
        salary = mySalary;
    }

    
}


public class Main
{
	public static void main(String[] args) {
		Employee emp1 = new Employee("Vishal", 40000);
		
		System.out.println("Employee name is " + emp1.getName());
		System.out.println("Employee salary is " + emp1.getSalary());
		
	}
}
