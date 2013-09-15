//http://www.codechef.com/problems/TWTCLOSE

package medium;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TweetOpenCount {
	

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int []A=new int [n+1];
		int k=in.nextInt();
		String S;
		
		while(k-->0){
			S=br.readLine();
			if(S.equals("CLOSEALL")){
				for(int i=1; i<=n;i++){
					A[i]=0;
				}
				countOpen(A);
			} else {
			
				int tw=Integer.valueOf(S.split(" ")[1]);
				if(A[tw]==0){
					A[tw]=1;
					countOpen(A);
				}
				else if(A[tw]==1){
					A[tw]=0;
					countOpen(A);
				} 
			}
		}
		
	}
	
	static void countOpen(int []A){
		int l=A.length, count=0;
		for(int i=1; i<l; i++){
			if(A[i]==1){
				count++;
			}
		}
		System.out.println(count);
	}
}
