package com.karthik;

public class Assignment1Q5 {
	
	public static void main(String[] args) {
		// Question 5
		int n=14;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==1||j==1||i==n-1||i-j>=(n-1)/2||i+j<=(n-1)/2)
				System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
