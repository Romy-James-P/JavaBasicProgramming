package com.ilpbatch4.utility;

public class ZPattern {

	public static void main(String[] args) {
		
		int N=4;
		MakeZPattern(N);

	}

	private static void MakeZPattern(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++){
				if(i==0 || i==n-1) {
					System.out.print("*");
				}
				else if(j==n-i-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}

}
