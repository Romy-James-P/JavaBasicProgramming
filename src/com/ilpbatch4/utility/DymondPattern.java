package com.ilpbatch4.utility;

public class DymondPattern {

	public static void main(String[] args) {
		int N=5;
		printDymondPattern(N);

	}

	private static void printDymondPattern(int n) {
		for(int i=1;i<=n-2;i++) {
			for(int j=n-2-i;j>0;j--){
				System.out.print(" ");
			}
			for(int k=i;k>=1;k--) {	
				System.out.print(k);
			}
			for(int l=2;l<=i;l++) {	
				System.out.print(l);
			}
			System.out.println();
		}
		for(int i=n-3;i>0;i--) {
			for(int j=n-2-i;j>0;j--){
				System.out.print(" ");
			}
			for(int k=i;k>=1;k--) {	
				System.out.print(k);
			}
			for(int l=2;l<=i;l++) {	
				System.out.print(l);
			}
			System.out.println();
		}
		
		
	}

}
