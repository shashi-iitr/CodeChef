package Sept2013;

import java.util.Scanner;

public class CoolGuysGCD {

	public static void main(String [] args){
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		while(T-->0){
			int N=in.nextInt();
			prob(N);
		}
	}
	
	static void prob(int N){
		int count=0;
		for(int i=1; i<=N; i++){
			for(int j=1; j<=i; j++){
				if(i%j==0){
					count++;
				}
			}
		}
		long [] A=new long [1000];
		int ci=1; A[1]=1;
		for(int i=1; i<=2; i++){
			int carry=0;
			for(int j=1; j<=ci; j++){
				A[j]=A[j]*N+carry;
				carry=(int) (A[j]/10);
				A[j]=A[j]%10;
			}
			
			while(carry>0){
				ci++;
				A[ci]=carry%10;
				carry=carry/10;
			}
		}
		int num=0;
		for(int k=ci; k>0; k--){
			num=(int) (num*10+A[k]);
		}
		System.out.println(count+"/"+num);
		
	}
}
