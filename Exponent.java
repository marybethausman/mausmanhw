package homework;

import java.util.Arrays;

public class Exponent {

public static int[] toPower(int size, int power) {
	int [] powerArray = new int[size];
	for (int i = 0; i <= size - 1; i++) {
		powerArray[i] = (int) (Math.pow(i, power));
	}
return(powerArray);
}


public static void main(String[] args) {

	System.out.println(Arrays.toString(toPower(4, 2)));

	}

}
//Write a public static method called "toPower" that takes in as parameters two integers 
//called size and power. The method should return an array of size "size" with each array 
//		index raised to the value of "power." So, for example, if we passed in "size = 4" 
//		and "power = 2" to the "toPower," the method should return the following result: 
//			[0,1,4,9].