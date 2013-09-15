//http://www.codechef.com/problems/CARVANS

package easy;

import java.util.Scanner;

public class CarMaxSpeed {

	public static void main(String [] args){
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		for(int i=1; i<=T; i++){
			int N=in.nextInt();
			int S=0;
			int [] A=new int[N+1];
			for(int j=1; j<=N; j++){
				S=in.nextInt();
				A[j]=S;
			}
			speed(A, N);
		}
	}
	
	
	static void speed(int [] A, int N){
		int count =0;
		int i=1;
		int min=A[1];
		while(i<=N){
			if(A[i]<=min){
				count++;
				min=A[i];
			}
			i++;
		}
		System.out.println(count);
	}
}
