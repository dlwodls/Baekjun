package Bronze_V;

import java.math.BigInteger;
import java.util.*;

// 2438번. 별 찍기 - 1
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i >= j) {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
}
