package com.algorithm.c1;

public class SearchProblem1 {
	public static int search(int[] A, int key){
		int i = 0;
		while((i < A.length) && (A[i] != key)){
			i ++;
		}
		if(i >= A.length)
			return -1;
		else
			return i;
	}
	
	public static void main(String[] args) {
		int[] A = new int[] { 31, 41, 59, 26, 41, 58};
		int ret = search(A,41);
		System.out.println(ret);
	}
	
}
