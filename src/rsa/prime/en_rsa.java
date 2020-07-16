/**
* @author: Lindsay
* @version: 
* @创建时间：2020年7月14日 下午6:26:13
* @说明: 
*/

package rsa.prime;

import java.util.Arrays;
import java.util.Scanner;

public class en_rsa {
	public static void main(String[] args) {
		ner_rsa a = new ner_rsa();
		int p = a.p;
		int q = a.q;
		int d = a.d;
		int n = a.n;
		int e = a.e;
		System.out.println("p:" + p + " " + "q:" + q + " " + "n:" + n + " " + "e:" + e + " " + " " + "d:" + d);
		Scanner sc = new Scanner(System.in);
		long[] b = new long[5];
		for (int i = 0; i < b.length; i++) {
			b[i] = sc.nextInt();
		}
		sc.close();
		b = en_cry(b, n, e);
		System.out.println(Arrays.toString(b));
		b = de_cry(b, n, d);
		System.out.println(Arrays.toString(b));
	}

	public static long[] en_cry(long[] b, int n, int e) {
		int l = b.length;
		long[] c = new long[l];
		for (int i = 0; i < c.length; i++) {
			c[i] = (((long) Math.pow((long) b[i], (int) e)) % n);
		}
		return c;
	}

	public static long[] de_cry(long[] b, int n, int d) {
		int l = b.length;
		long[] c = new long[l];
		for (int i = 0; i < c.length; i++) {
			c[i] = (((long) Math.pow((long) b[i], (int) d)) % n);
		}
		return c;
	}
}
