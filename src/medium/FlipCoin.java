//http://www.codechef.com/problems/FLIPCOIN

package medium;

import java.util.Scanner;

public class FlipCoin {

	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		int [] C=new int [N];
		for(int i=0; i<N; i++){
			C[i]=1;
		}
		int Q=in.nextInt();
		while(Q-->0){
			int x=in.nextInt();
			int A=in.nextInt();
			int B=in.nextInt();
			if(x==0){
				for(int i=A; i<=B; i++){
					C[i]*=-1;
				}
			} else if(x==1){
				int count=0;
				for(int i=A; i<=B; i++){
					if(C[i]!=1){
						count++;
					}
				}
				System.out.println(count);
			}
		}
		
	}
	
}
