package homework;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SumOfGivenArray {


		public static void main(String args[]){
		      int[] array = {10, 20, 30, 40, 50, 10};
		      int sum = 0;
		      for( int num : array) {
		          sum = sum+num;
		      }
		      System.out.println("Sum of array elements is:"+sum);
		   }
}

