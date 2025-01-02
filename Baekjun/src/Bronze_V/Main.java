package Bronze_V;

import java.math.BigInteger;
import java.util.*;

// 2420번. 사파리월드
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		BigInteger n = sc.nextBigInteger();
		BigInteger m = sc.nextBigInteger();
		
		BigInteger result = n.subtract(m);
		
		System.out.println(result.abs());
	}
}
