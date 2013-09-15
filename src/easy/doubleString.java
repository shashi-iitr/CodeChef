// Submitted  http://www.codechef.com/problems/DOUBLE

package easy;

import java.util.Scanner;

public class doubleString {

	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t-->0){
			int n=in.nextInt();
			if(even(n)){
				System.out.print(n);
				System.out.println();
			}
			else{
				System.out.print(n-1);
				System.out.println();
			}
		}
	}
	
	
	
	static boolean even(int i){
		if(i%2!=0){
			return false;
		}
		return true;
	}
}
