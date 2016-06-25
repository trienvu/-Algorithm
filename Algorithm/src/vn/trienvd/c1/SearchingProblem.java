package vn.trienvd.c1;

public class SearchingProblem {
	public static int searchV(int v,int [] A){
		int n = A.length;
		for(int i = 0; i < n; i++){			
			if(v == A[i])
			{	return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] A = new int[] { 31, 41, 59, 26, 41, 58};
		int ret = searchV(539,A);
		System.out.println(ret);
	}
}
