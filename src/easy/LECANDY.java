// submitted       http://www.codechef.com/problems/LECANDY


package easy;

import java.util.Scanner;

public class LECANDY {

	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		for(int i=1; i<=T ;i++){
			int N=in.nextInt();
			int C=in.nextInt();
			int []A=new int [N+1];
			int K=0;
			for(int j=1; j<=N; j++){
				K=in.nextInt();
				A[j]=K;
			}
			if(isLecandy(N, C, A)){
				System.out.println("Yes");
			} else System.out.println("No");
		}
	}
	
	static boolean isLecandy(int N, int C, int []A){
		
		if(C<N){
			return false;
		}
		int sum=0;
		for(int i=1; i<=N; i++){
			sum+=A[i];
		}
		if(sum>C){
			return false;
		}
		
		return true;
	}
}
