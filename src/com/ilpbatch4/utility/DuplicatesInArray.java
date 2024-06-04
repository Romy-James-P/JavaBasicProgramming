package com.ilpbatch4.utility;

public class DuplicatesInArray {

	public static void main(String[] args) {
		int array[]= {1,6,6,5,7,4,3,4,8};
		findDuplicate(array);

	}

	private static void findDuplicate(int[] array) {
		boolean duplicateFound=false;
		
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i]==array[j]) {
					System.out.println(array[i]);
					duplicateFound = true;
					break;
				}
			}
		}
		if(!duplicateFound) {
			System.out.println("No duplicates");
		}
		
	}

}
