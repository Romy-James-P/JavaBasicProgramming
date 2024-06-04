package com.ilpbatch4.utility;

public class MissingNumberInArray {

	public static void main(String[] args) {
		int limit=10;
		int array[]= {1,2,4,5,7,8};
		for(int i=1;i<=limit;i++) {
			int flag=0;
			for(int j=0;j<array.length;j++) {
				if(array[j]==i) {
				flag=1;
				}
			}
			if(flag==0) {
				System.out.println(i);
			}
		}
		
	}

}
