// submitted   http://www.codechef.com/problems/MAXCOUNT

package easy;

import java.util.Scanner;

public class MAXCOUNT {

	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		
		for(int i=1; i<=T; i++){
			int N=in.nextInt();
			int [] A=new int [N];
			int [] B=new int [10001];
			for(int j=0; j<N; j++){
				A[j]=in.nextInt();
				B[A[j]]+=1;
			}
			
			int maxA=A[0];
			for(int j=1; j<N; j++){
				if(maxA>A[j])
					maxA =maxA;
				else 
					maxA =A[j];
			}
			
			int max=B[1];
			for(int j=2; j<=maxA; j++){
				if(max>B[j])
					max =max;
				else 
					max =B[j];
			}
			
			int count=0, j=0;
			while(B[j]<max){
				count++;
				j++;
			}
			
			System.out.println();
			System.out.println(count +" "+ max);
		}
	}
}
