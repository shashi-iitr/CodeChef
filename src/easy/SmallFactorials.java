//   http://www.codechef.com/problems/FCTRL2
package easy;

import java.util.Scanner;

public class SmallFactorials {

	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		for(int i=T; i>0; i--){
			int n=in.nextInt();
			System.out.println(factorial(n));
		}
	}
	
	
	static long factorial(long l){
		if(l==0)
			return 1;
		if(l==1)
			return 1;
		return l*factorial(l-1);
	}
}