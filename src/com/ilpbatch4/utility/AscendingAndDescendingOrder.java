package com.ilpbatch4.utility;

public class AscendingAndDescendingOrder {

	public static void main(String[] args) {
		int array[]= {1,20,6,8};
		
		int largest = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > largest) {
				largest = array[i];
			}
		}
		int smallest=largest;
		int secondSmallest=largest;
		int thirdSmallest=largest;
		int fourthSmallest=largest;
		for (int i = 0; i < array.length; i++) {
			if (array[i] < smallest) {
				fourthSmallest=thirdSmallest;
				thirdSmallest=secondSmallest;
				secondSmallest=smallest;
				smallest = array[i];
			}
			else if(array[i]<secondSmallest) {
				fourthSmallest=thirdSmallest;
				thirdSmallest=secondSmallest;
				secondSmallest=array[i];
			}
			else if(array[i]<thirdSmallest) {
				fourthSmallest=thirdSmallest;
				thirdSmallest=array[i];
			}
			else {
				fourthSmallest=array[i];
			}
		}
		System.out.println(smallest);
		System.out.println(secondSmallest);
		System.out.println(thirdSmallest);
		System.out.println(fourthSmallest);
	}
}
