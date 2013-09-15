//  submitted   http://www.codechef.com/problems/CANDLE

package easy;

import java.util.Scanner;

public class CANDLE {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for (int i = 1; i <= T; i++) {
			int[] A = new int[10];
			for (int j = 0; j < 10; j++) {
				A[j] = in.nextInt();
			}

			int min = A[0];
			for (int j = 1; j < 10; j++) {
				if (min > A[j])
					min = A[j];
			}

			int j = 0, count = 0;
			while (A[j] > min) {
				count++;
				j++;
			}

			if (min > 0 && A[0] != min) {
				int g = 0;
				for (int k = 1; k <= min + 1; k++) {
					g = g * 10 + count;
				}
				System.out.println(g);

			} else if (min > 0 && A[0] == min) {
				int min2 = A[1];
				for (int p = 2; p < 10; p++) {
					if (min2 > A[p])
						min2 = A[p];
				}

				int p = 1, temp2 = 1;
				while (A[p] > min2) {
					temp2++;
					p++;
				}
				if (min2 == min) {
					int g = 0;
					for (int k = 1; k <= min2 + 1; k++) {
						g = g * 10 + temp2;
					}
					System.out.println(g);
				}

				else if (min2 > min) {
					int g = 1;
					for (int k = 1; k <= min + 1; k++) {
						g = g * 10;
					}
					System.out.println(g);
				}
			}

			else if (min == 0 && A[0] != 0) {
				System.out.println(count);
			} else if (min == 0 && A[0] == 0) {
				int min1 = A[1];
				for (int p = 2; p < 10; p++) {
					if (min1 > A[p])
						min1 = A[p];
				}

				int p = 1, temp = 1;
				while (A[p] > min1) {
					temp++;
					p++;
				}

				if (min1 > 0) {
					System.out.println(1 * 10 + A[0]);
				}

				else if (min1 == 0) {
					System.out.println(temp);
				}
			}
		}
	}
}