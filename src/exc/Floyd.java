package exc;

import java.util.Scanner;

public class Floyd {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int rows = s.nextInt();
		Floyd(rows);
	}
	
	public static void Floyd(int rows) {
		int num = 1;
		System.out.println(rows);
		
		for(int i = 1; i <= rows; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.println(num + " ");
				num++;
			}
			System.out.println();
		}
	}

}
