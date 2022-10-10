/******************************************************************************
Parameterized Constructor
*******************************************************************************/
class Employee
{
    /*
    Employee()
    {
        System.out.println("Vishal Kadam");
    }
    */
    
    Employee(String name, int salary){
        System.out.println("Employee name is " + name + " and salary is " + salary);
    }
}

public class Main
{
	public static void main(String[] args) {
		
		Employee emp1 = new Employee("Vishal Kadam", 40000);
		
		Employee emp2 = new Employee("Chetan Zolekar", 80000);
		
		Employee emp3 = new Employee("Mahesh Jadhav", 120000);
		
	}
}
