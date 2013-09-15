//   http://www.codechef.com/problems/ROWCOLOP

package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ROWCOLOP {

	public static void main(String[] args) throws IOException {
		//Scanner in = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		int N = Integer.valueOf(s.split(" ")[0]);//in.nextInt();
		String S;
		int[][] A = new int[N + 1][N + 1];
		int Q = Integer.valueOf(s.split(" ")[1]);
		int r = 0, c = 0, X = 0;
		while(Q-->0) {
			S = br.readLine();//in.nextLine();
			//System.out.println(S);
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
