//  http://www.codechef.com/problems/LAPIN

package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class LapinDrome {

	public static void main(String[] args) throws IOException{
		//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		/*Scanner in=new Scanner(System.in);
		int T=Integer.valueOf(in.nextLine());
		lapin(T);
	}
	static void lapin(int T) throws IOException{
		//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Scanner in=new Scanner(System.in);
		while(T-->0){
			String S= in.nextLine(); //"helplphe";
			if(lapin(S)){
				System.out.print("YES");
			} else
				System.out.print("NO");
			
		}*/
		
		String S= "helfhplphhe";
		if(lapin(S)){
			System.out.print("YES");
		} else
			System.out.print("NO");
		
	}
	
	static boolean lapin(String S){
		int l=S.length();
		char[] ch=S.toCharArray();
		int [] A=new int [256];
		int [] B=new int [256];
		if(l%2==0){
			for(int j=0; j<l/2; j++){
				A[ch[j]]+=1;
			}
			for(int i=l/2; i<l; i++){
				B[ch[i]]+=1;
			}
		} else{
			for(int j=0; j<l/2; j++){
				A[ch[j]]+=1;
			}
			for(int i=(l/2)+1; i<l; i++){
				B[ch[i]]+=1;
			}
		}
		for(int k=0; k<256; k++){
			if(A[k]!=B[k]){
				return false;
			}
		}
		
		return true;
	}
//	
//	public static int charToAscii(char c){
//		int a=c;5
//		return a;
//	}
}
