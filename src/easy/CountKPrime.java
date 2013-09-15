package easy;

import java.util.Scanner;

public class CountKPrime {

	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		for(int i=1; i<=T; i++){
			int A=in.nextInt();
			int B=in.nextInt();
			int K=in.nextInt();
			int count3=0;
			int [] G=new int [B+1];
			for(int j=A; j<=B; j++){
				int b=kPrime(j, K);
				G[j]=b;
				}
			for(int s=0; s<=B; s++){
				if(G[s]!=0)
					count3++;
			}
			System.out.print(count3);
		}
	}

	
	static int kPrime(int j, int K){
		int []A=new int[j+1];
		for(int i=0; i<=j; i++){
			A[i]=i;
		}
		
		for(int t=0; t<=j; t++){
			if(A[t]!=1 && A[t]!=0){
				for(int k=2*t; k<=j; k+=t){
					A[k]=1;
				}
			}
		}
		int l=j;
		int [] B=new int [j+1];
		for(int p=0; p<=j; p++){
			int count=0;
			if(A[p]!=0 && A[p]!=1){
				while(l%p==0){
					count++; 
					l=l/p;
					B[p]=p;
				}
			}
		}
		int count1=0;
		int [] C=new int [j+1];
		for(int i=0; i<=j; i++){
			if(B[i]!=0){
				count1++;
				C[i]=count1;
			}
		}
		int [] D=new int [j+1];
		int count2=0;
		for(int i=0; i<=j; i++){
			if(C[i]!=0){
				count2++;
				D[i]=count2;
			}
		}
		if(count2!=K)
			return 0;
		return count2;
	}
}