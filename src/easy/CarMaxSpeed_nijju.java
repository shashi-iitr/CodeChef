package easy;

import java.util.Scanner;

public class CarMaxSpeed_nijju {
	public static void main(String [] args){
		Scanner in=new Scanner(System.in);
		int t= in.nextInt();
		while(t-- >0){
			int n=in.nextInt();
			int min=in.nextInt();
			int temp, count=1;	
			for(int i=1;i<n;i++){
				temp=in.nextInt();
				if(temp<=min){
					count++;
					min=temp;
				}
			}
			System.out.println(count);
		}
	}
	
	public static int carsWithMaxSpeed(int []A, int l){
		int n=1;
		//int l=A.length;
		int min=A[1];
		for(int i=2;i<=l;i++){
			if(A[i]<=min){
				n++;
				min=A[i];
			}
		}
		return n;
	}

}
