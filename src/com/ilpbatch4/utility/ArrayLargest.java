package com.ilpbatch4.utility;

public class ArrayLargest {

	public static void main(String[] args) {
		int array[]= {10,7,5,7,9,4,3};
	
		largestOfArray(array);
	}

	private static void largestOfArray(int[] array) {
		int largest=0;
		int secondlargest=0;
		for(int i=0;i<array.length;i++) {
          if(array[i]>=largest) {
        	  secondlargest=largest;
        	  largest=array[i];
          }
      	else if(array[i]>=secondlargest) {
      		secondlargest=array[i];
      	}
		}
	
       System.out.println(largest+" "+secondlargest);
		
	}

}
