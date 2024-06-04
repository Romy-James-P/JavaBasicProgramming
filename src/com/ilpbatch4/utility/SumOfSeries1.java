package com.ilpbatch4.utility;

public class SumOfSeries1 {

	public static void main(String[] args) {
		int input=8;
		sumOfSeries(input);
	}

	private static void sumOfSeries(int n) {
		int sum=0;
		int x=0;
		for(int i=1;i<=n;i++) {
			if(i%2!=0) {
				if(x==0) {
					sum+=i;
					x=1;
				}
				else {
					sum-=i;
					x=0;
				}
			}
		}
		System.out.print("Sum="+sum);
		
	}
}
