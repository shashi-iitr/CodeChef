// http://www.codechef.com/problems/MULTQ3

package medium;

import java.util.Scanner;

public class MultipleOfThree {

	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		int [] a=new int [N];
		int Q=in.nextInt();
		while(Q-->0){
			int x=in.nextInt();
			int A=in.nextInt();
			int B=in.nextInt();
			
			if(x==0){
				for(int i=A; i<=B; i++){
					a[i]++;
				}
			} else if(x==1){
				int count=0;
				for(int i=A; i<=B; i++){
					if(a[i]%3==0 ){
						count++;
					}
				}
				System.out.println(count);
			}
			
		}
	}
}
