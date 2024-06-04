package com.ilpbatch4.utility;

public class SumOfSeries2 {

	public static void main(String[] args) {
		int input=2;
		sumOfSeries(input);
		
	}

	private static void sumOfSeries(int input) {
		if(input==0) {
			System.out.print("Sum of series=0");
		}
		else if(input==1) {
			System.out.print("Sum of series=1");
		}
		else {
			int sum=9;
			int first=1;
			int second=2;
			int next;
			
			for(int i=3;i<=input;i++) {
				next=first+second;
				sum+=(next*next*next);
				
				first=second;
				second=next;
			}
				
			System.out.print("Sum of series="+sum);
		}
	}

}
