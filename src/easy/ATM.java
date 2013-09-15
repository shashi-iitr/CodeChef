// submitted  http://www.codechef.com/problems/HS08TEST

package easy;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		
		int money=in.nextInt();
		double balance=in.nextFloat();
		
		if(money%5==0 && (money+0.50)<balance){
			double withdraw=balance-money-0.50;
			System.out.printf("%.2f",withdraw);
		}
		else
			System.out.printf("%.2f",balance);
	}
}
