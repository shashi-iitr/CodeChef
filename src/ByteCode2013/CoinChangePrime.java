//   http://www.codechef.com/BTCD2013/problems/CNG

package ByteCode2013;

import java.util.Scanner;

public class CoinChangePrime {

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int T=in.nextInt();
		
		for(int i=1; i<=T; i++){
			int c=in.nextInt();
			int d=in.nextInt();
			primeCoin(c, d);
		}
	}
	
	static void primeCoin(int c, int d){
		if(c==2){
			int count=0, i=1;
			while(i<d){
				i+=2;
			}
			if(i==d){
				i-=2;
			}
			System.out.println(i);
		}else if(d==2){
			int count=0, i=1;
			while(i<c){
				i+=2;
			}
			if(i==c){
				i-=2;
			}
			System.out.println(i);
		}else {
			int n=100;
			int []A=new int [n];
			int []B=new int [n];
			for(int j=0; j<n; j++){
				A[j]=c*(j+1);
			}
			for(int k=0; k<n; k++){
				B[k]=d*(k+1);
			}
			int []D=new int [(n*n)+1];
			int k=0;
			for(int i=0; i<n; i++){
				for(int j=0; j<n; j++){
					D[k++]=A[i]+B[j];
				}
			}
			int count=0;
			int [] E= new int [((c+d)*n)+1];
			for(int i=0; i<n*n; i++){
				E[D[i]]=1;
				count++;
			}
			
			int j=count;
			while(E[j]>0){
				j--;
			}
			System.out.print(count-j);
		}
	}
}
