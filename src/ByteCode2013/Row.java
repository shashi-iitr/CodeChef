package ByteCode2013;

import java.util.Scanner;

public class Row {

	public static void main(String[] args)  {
		Scanner in = new Scanner(System.in);
		Scanner scan = new Scanner(System.in);
		int N = in.nextInt();
		String S;
		int[][] A = new int[N + 1][N + 1];
		int Q = in.nextInt();
		int r = 0, c = 0, X = 0;
		while(Q-->0) {
			S = scan.nextLine();
			if(S.contains("ColAdd")){
				r=Integer.valueOf(S.split(" ")[1]);
				X=Integer.valueOf(S.split(" ")[2]);
				incCol(A, N, r, X);
			}
			else {
				r=Integer.valueOf(S.split(" ")[1]);
				X=Integer.valueOf(S.split(" ")[2]);
				incRow(A, N, r, X);
			}
		}
		int b = max(A, N, r,  X);
		System.out.println(b);
	}
	
	static void incCol(int [][]A, int N, int c, int X){
		for (int i = 1; i <= N; i++) 
			A[i][c] += X;
	}
	
	
	static void incRow(int [][]A, int N, int r, int X){
		for (int j = 1; j <= N; j++) 
			A[r][j] += X;
	}
	
	
	static int max(int[][] A, int N, int r,  int X) {
		int max = -1;
		for (int i = 1; i <= N; i++) 
			for (int j = 1; j <= N; j++) 
				if (max < A[i][j]) 
					max = A[i][j];
		return max;
	}
}