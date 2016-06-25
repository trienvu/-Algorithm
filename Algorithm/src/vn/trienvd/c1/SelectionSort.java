package vn.trienvd.c1;

public class SelectionSort {
	private static void selectionSort(int[] A) {
		int n = A.length;
		int j;
		int min;
		for (int i = 0; i < n - 1; i++) {
			min = i;
			j = i + 1;
			while (j < n) {
				if (A[j] < A[min])
					min = j;
				j ++;
			}			
			swapper(i,min, A);
		}
		for (int i = 0; i < n; i++) {
			System.out.print(A[i] + ",");
		}
	}
	
	private static void swapper(int index1, int index2,int [] A){
		int temp = A[index1];		
		A[index1] = A[index2];
		A[index2] = temp;
	}
	public static void main(String[] args) {
		int[] A = new int[] { 31, 41, 59, 26, 43, 58 };
		selectionSort(A);
	}
}
