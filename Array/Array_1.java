public class Main
{
	public static void main(String[] args) {
		int[] arr; //declaration
		arr=new int[5]; //memory allocation
		//int[] arr={1,2,3,4,5}; //declaration +  initilization
		arr[0]=1; //initilization
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		
		//Print output
		for(int i=0;i<5;i++)
		{
		    System.out.print(arr[i] + " ");
		}
		
		String [] name={"Vishal", "Sham", "Kadam", "Ram"};
		
		System.out.println(name[0]);
		System.out.println(name.length);
		
	}
}
