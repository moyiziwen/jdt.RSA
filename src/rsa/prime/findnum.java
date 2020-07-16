/**
* @author: Lindsay
* @version: 
* @创建时间：2020年7月14日 下午3:11:02
* @说明: 
*/

package rsa.prime;

public class findnum {
	public int gcd(int r, int e) {
		int i = 0;
		if (e < r) {
			if (r % e == 0) {
				i = e;
			} else {
				return gcd(e, r % e);
			}
		} else if (e >= r) {
			System.exit(0);
		}
		return i;
	}

	public int rsa_ne(int p, int q) {
		int r = (p - 1) * (q - 1);
		int e = 0;
		for (int i = 2; i < r; i++) {
			if (gcd(r, i) == 1) {
				e = i;
				break;
			}
		}
		return e;
	}

	public int rsa_nd(int e, int r) {
		int d = 0;
		for (int i = 0; i < r; i++) {
			if (((e * i) % r) == 1) {
				d = i;
				break;
			}
		}
		return d;
	}

	public int rsa_pq() {
		creatprime a = new creatprime();
		int[] p_array = a.prime_array();
		int i = 0;
		while (p_array[i] != 0) {
			i++;
		}
		int j = (int) (Math.random() * i);
		return p_array[j];
	}
}
