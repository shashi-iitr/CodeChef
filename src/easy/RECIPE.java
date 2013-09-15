// http://www.codechef.com/problems/RECIPE

package easy;

import java.util.Scanner;

public class RECIPE {

	public static void main(String[] args){
		
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		
		for(int i=1; i<=T; i++){
			int N=in.nextInt();
			int [] A=new int [N];
			for(int j=1; j<=N; j++){
				int k=in.nextInt();
				A[j-1]=k;
			}

			
			int min=A[0];
			for(int s=1; s<N; s++){
				if(min>A[s])
					min=A[s];
				else min=min;
			}
		
			
				if (recipe(A, N, min)){
					for(int t=0; t<N; t++){
					System.out.print((A[t] / min)+" ");
					}
				}
				else{
					for(int t=0; t<N; t++){
					System.out.print(A[t]+" ");
					}
				}
			
			System.out.println();
		}
	}
	
	
	static boolean recipe(int []A, int N, int min){
		for(int p=0; p<N; p++){
			if(A[p]%min!=0)
				return false;
		}
	return true;
	}
}