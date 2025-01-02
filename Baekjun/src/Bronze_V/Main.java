package Bronze_V;

import java.util.*;

// 2739번. 구구단
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int dan = sc.nextInt();
		
		for (int is = 1; is <= 9; is++) {
			System.out.println(dan + " * " + is + " = " + (dan * is));
		}
	}
}
