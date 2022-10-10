/******************************************************************************
Parameterized Constructor
*******************************************************************************/
class Employee
{
    /*
    //Default constructor
    Employee()
    {
        System.out.println("Vishal Kadam");
    }
    */
    
  //Parameterized Constructor
    Employee(String name, int salary){
        System.out.println("Employee name is " + name + " and salary is " + salary);
    }
}

public class Main
{
	public static void main(String[] args) {
		
		Employee emp1 = new Employee("Vishal Kadam", 40000);
		
	}
}
