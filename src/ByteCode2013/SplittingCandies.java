package ByteCode2013;

import java.util.Scanner;

public class SplittingCandies {

	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		for(int i=1; i<=T; i++){
			int N=in.nextInt();
			int K=in.nextInt();
			int count=0;
			int l=N;
			if(K==0)
				System.out.print(0+" "+ l);
			else if(l<K){
				System.out.print(0+" ");
				System.out.println(l);
			}
			else{
			l=l%K;
			N=N/K;
			System.out.print(N+" ");
			System.out.println(l);
			}
		}
	}
}
