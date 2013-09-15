//   http://www.codechef.com/problems/SUMTRIAN

package easy;

import java.util.Scanner;

public class SumTrain {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		
		while(t-->0){
			int n=in.nextInt();
			int [][]A=new int [n+1][n+1];
			for(int i=1; i<=n; i++){
				for(int j=1; j<=i; j++){
					A[i][j]=in.nextInt();
				}
			}
			System.out.print(sumTrain(A, n, 1, 1));
		}
	}
	
	
	static int sumTrain(int [][]A, int n, int i, int j){
		if(i==n)
			return A[i][j];
		return A[i][j]+max(sumTrain(A, n, i+1 ,j), sumTrain(A, n, i+1, j+1));
		}
	
	
	static int max(int a, int b){
		return (a>b?a:b);
	}
}
