// http://www.codechef.com/problems/LASTDIG

package easy;

import java.util.Scanner;


public class LASTDIG {
	
	public static int [] D= new int[400000010];
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for (int i = 1; i <= T; i++) {
			int A = in.nextInt();
			int B = in.nextInt();
			lastDigit(A, B);
		}
	}

	static void lastDigit(int A, int B) {
		
		int sumD = 0;
		for (int j = A; j <= B; j++) {
			if(D[j]==0){
			int sum = 0;

			int l = j;
			while (l > 0) {
				int a = l % 10;
				if (a % 2 == 0) {
					sum = sum + a * 2;
				} else
					sum = sum + a;
				l = l / 10;
			}
			
			sumD += sum % 10;
			D[j]=sum%10;
			} else {
				sumD+=D[j];
			}
			
		}
		

		System.out.println(sumD);
	}
}
