package Bronze_V;

import java.math.BigInteger;
import java.util.*;

public class 엄청난부자2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		BigInteger n = sc.nextBigInteger();
		BigInteger m = sc.nextBigInteger();
		
		BigInteger q = n.divide(m);
		BigInteger r = n.remainder(m);
		
		System.out.println(q);
		System.out.println(r);
	}
}
