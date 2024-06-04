package com.ilpbatch4.utility;

public class SumOfSeries4 {

	public static void main(String[] args) {
		int input = 13;
		sumOfTheSeries(input);
		
	}
	private static void sumOfTheSeries(int input) {
		
		float sum = 0;
		for(int i=1;i<=input;i++)
		{
			sum += (i/ factorial(i));
		}
		System.out.println("Sum of series= "+sum);

	}
	private static float factorial(int n) {
		int factorialOfNumber = 1;
		for(int i=1; i<=n; i++) {
			factorialOfNumber *= i;
		}
		return factorialOfNumber;
	}

}
