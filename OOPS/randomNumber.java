/******************************************************************************

randomNumber

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int randomNumber = (int) (Math.random()*100);
	    
	    
	    int myInput=0;
	    int retry=0;
	    do{ 
	        System.out.println();
	  
	        retry=retry+1;
	        System.out.println(retry);
	         System.out.println();
	        System.out.println("Enter your number");
	         myInput = sc.nextInt();
	        
	        if(myInput == randomNumber){System.out.println("YESSSSS......you guess right number, Congratulation.."); break;}
	        
	        
	        else if(myInput > randomNumber){System.out.println("Your number is too large");}
	        
	        else if(myInput < randomNumber){System.out.println("Your number is too small");}
	        
	    } while(myInput>=0);
		
	}
}
