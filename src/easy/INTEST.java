//  http://www.codechef.com/problems/INTEST

package easy;

import java.util.Scanner;

public class INTEST {
	
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int k=in.nextInt();
		int count=0;
		while(n-->0){
			if(in.nextInt()%k==0)
				count++;
		}
		System.out.println(count);
	}
}