package com.ilpbatch4.utility;

public class SortArrayOfZeroOneTwo {

	public static void main(String[] args) {
		int[] array= {2,0,2,2,1,0,1,2,0,1};
        sortArray(array);
	}

	private static void sortArray(int[] array1) {
		for(int i=0;i<array1.length;i++) {
			for(int j=i+1;j<array1.length;j++) {
				if(array1[j]<array1[i]) {
					int temp=array1[i];
				    array1[i]=array1[j];
				    array1[j]=temp;
				}
			}
		}
		System.out.print("Sorted array: ");
		for(int i=0;i<array1.length;i++) {
			System.out.print(array1[i]+" ");
		}
	}
}
