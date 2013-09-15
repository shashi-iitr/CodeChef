// submitted  Palindromes prime   http://www.codechef.com/problems/PRPALIN

package easy;

import java.util.Scanner;

public class PRPALIN {

	public static void main(String[] args){
		Scanner in =new Scanner(System.in);
		int N=in.nextInt();
		
		for(int M=N; ;M++ ){
			if(N==1)
				M=N+1;
			if (prPalin1(M) && prPalin(M)) {
				System.out.print(M);
				break;
			}
		}
	}

	
	static boolean prPalin(int i){
		int b=(int) Math.sqrt(i);
		for(int j=2; j<=b; j++)
			if(i%j==0)
				return false;
		return true;
	}

	
	static boolean prPalin1(int i){
		int palindrome=i;
		int reverse =0;
		while(palindrome!=0){
			int remainder =palindrome%10;
			reverse=reverse*10+remainder;
			palindrome=palindrome/10;
		}
		if(reverse!=i)
			return false;
		else
			return true;
	}
}

