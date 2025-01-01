package Bronze_V;

import java.util.*;

// 1330번. 두 수 비교하기
public class Main {
	public static void main(String[] args) {
		double a, b;
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		
		if (a > b) {
			System.out.println(">");
		}
		else if (a == b) {
			System.out.println("==");
		}
		else {
			System.out.println("<");
		}
	}
}
