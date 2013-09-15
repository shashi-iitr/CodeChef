//http://www.codechef.com/problems/PALIN

package medium;

import java.util.Scanner;

public class NextPalindrome {
	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		while(T-->0){
		long  K=in.nextLong();
			nextPalin(K);
		}
	}
	
	static void nextPalin(long K){
		long a=K, b=K;
		int count=0;
		while(a>0){
			a=a/10;
			count++;
		}
		int i=0;
		int []A=new int[count];
		while(b>0){
			A[i]=(int) (b%10);
			b=b/10;
			i++;
		}
		for(int j=0, k= count-1; j<=k;j++, k--){
			if(A[j]!=A[k]){
				nextPalin(K+1);
				return;
			} else if(j==k || k-j==1 ){
					System.out.println(K);
					return;
			}
		}
	} 
}