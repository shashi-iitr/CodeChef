//   http://www.codechef.com/problems/PCYCLE

package easy;

import java.util.Scanner;

public class PermutationCycle {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		String s=in.toString();
		int l=s.length();
		char [] ch=s.toCharArray();
		int b=cycle(ch, l);
		System.out.print(b);
				
			}

	
	static int cycle(char [] ch, int l){
		for(int i=1; i<=l; i++){
			System.out.print(i);
			while(ch[cycle(ch, i)]!=i)
				return (ch[cycle(ch,i)]);
		}
		return (ch[cycle(ch,l)]);
	}
}
