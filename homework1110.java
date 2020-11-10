package homework;
import java.util.Scanner;

public class homework1110 {

	public static void main(String[] args) {
		
		//Create a small program that defines some fields.
		int age = 15;
		Scanner input = new Scanner(System.in); 
		String favColor = "blue";
		
		// Try creating some illegal field names and see what kind of error the compiler produces. If you remove int and string, age & favcolor can't be resolved to variable. Need to specify variable type.
//		 age = 15;
//		Scanner input = new Scanner(System.in); 
//		 favColor = "blue";

//		In the program you created, try leaving the fields uninitialized and print out their values. Try the same with a local variable and see what kind of compiler errors you can produce. 
		int age;
		String favColor;
		
		System.out.println(age);
		System.out.println(favColor);
		
//		result: The local variable age may not have been initialized
//		The local variable favColor may not have been initialized
		
//		
	}
}


