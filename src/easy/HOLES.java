// submitted  http://www.codechef.com/problems/HOLES

package easy;

import java.util.Scanner;

public class HOLES {

	public static void main(String[] argss){
		
		Scanner in=new Scanner(System.in);
		int T = Integer.valueOf(in.nextLine());
		in.reset();
		for(int j=0;j<T; j++){
			String text=in.nextLine();
			char [] ch=text.toCharArray();
			int n=text.length();
			int sum=0;
			for(int i=0;i<n;i++){
				char c = ch[i];
				if(c=='A' || c=='D' || c=='O' || c=='P' || c=='R' || c=='Q')
					sum++;
				if(c=='B')
					sum+=2;
			}
			System.out.println(sum);
		}
	}
}
