package com.ilpbatch4.utility;

public class SumOfSeries3 {

	public static void main(String[] args) {
		int input=5;
		sumOfSeries(input);
	}

	private static void sumOfSeries(int input) {
		int sum=0;
		int x=0;
		int y=1;
		for(int i=1;i<=input;i++) {
			if(i%2!=0) {
				if(x==0) {
					sum+=Math.pow(i, y);
					x=1;
					y++;
				}
				else {
					sum-=Math.pow(i, y);
					x=0;
					y++;
				}
			}
		}
		System.out.print("Sum="+sum);
		
	}

}
