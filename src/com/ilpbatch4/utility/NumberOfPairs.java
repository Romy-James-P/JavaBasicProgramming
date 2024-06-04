package com.ilpbatch4.utility;

public class NumberOfPairs {

	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7,8,9};
	    int k = 9;
        findPairs(array,k);
	}

	private static void findPairs(int[] array, int k) {
		int count = 0;
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i]+array[j]==k) {
					count++;
				}
			}
		}
		System.out.print("Number of pairs: "+count);
	}

}
