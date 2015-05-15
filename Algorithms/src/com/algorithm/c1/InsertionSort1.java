package com.algorithm.c1;

public class InsertionSort1 {
	public static void insertionSort(int [] A){
		int n = A.length;
		int key;
		int i,j;
		for(j = 1; j < n; j ++){
			i = j -1;
			key = A[j];
			while(i >= 0 && A[i] > key){
				A[i + 1] = A[i];
				i = i-1;
			}
			A[i+1] = key;
		}
		for (i = 0; i < n; i++) {
			System.out.print(A[i] + ",");
		}
	}
	
	public static void main(String[] args) {
		int[] A = new int[] { 31, 41, 59, 26, 41, 58};
		insertionSort(A);
	}
}
