//http://www.codechef.com/SEPT13/problems/INTEG

package Sept2013;

import java.util.Scanner;

public class ChefAndInt {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] A = new int[N];
		int i = 0, M=N;
		
		while (N-- > 0) {
			int Ai = in.nextInt();
			if(Ai<0){
				A[i++]=Ai*(-1);
			}
		}
		int x = in.nextInt();
		long b = countMinCost(A, i, x);
		System.out.print(b);
	}

	static long countMinCost(int[] A, int i, int x) {
		long sum=0;
		
		if (i == 0) {
			return i;
		}
		
		quickSort(A, 0, i-1);
		if(i==x){
			for(int k=0; k<i;k++){
				sum=sum+A[k];
			}
			if(sum<A[x-1]*x){
				return sum;
			} else return A[i-1]*x;
		}
		
		else if(i>x){
			sum=A[x-1]*x;
			for(int l=x; l<i; l++){
				sum=sum+(A[l]-A[x-1]);
			}
		}else{ 
			for (int j = 0; j <i; j++) {
				sum+=A[j];
			}
		}
		return sum;
	}

		
	static void quickSort(int[] a, int p, int r){
        if(p<r)
        {
            int q=partition(a,p,r);
            quickSort(a,p,q);
            quickSort(a,q+1,r);
        }
    }

    static int partition(int[] a, int p, int r) {
        int x = a[p];
        int i = p ;
        int j = r ;

        while (i<j) {
            while (a[i] < x)
                i++;
            while (a[j] > x)
                j--;
            if (i < j)
                swap(a, i, j);
           
        }
        
        return j;
    }

    static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
