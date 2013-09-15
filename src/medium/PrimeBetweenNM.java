//http://www.codechef.com/problems/PRIME1

package medium;

import java.util.Scanner;

public class PrimeBetweenNM {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		while (T-- > 0) {
			boolean flag =false;
			int m = in.nextInt();
			int n = in.nextInt();
			for(int i =m; i<=n; i++){
				if(i==1){
				}
				else if(i==2){
					System.out.println(2);
				}
				else if(i%2!=0 && isPrime(i)){
					flag =true;
					System.out.println(i);
				}
			
			
			}
			if(!flag){
				System.out.println(0);
			}
			System.out.println();
		}
	}
	
	static boolean isPrime(int i){
		int sqrI=(int) Math.sqrt(i);
		for(int j=3; j<=sqrI; j+=2){
			if(i%j==0){
				return false;
			}
		}
		
		return true;
	}

}
