/**
* @author: Lindsay
* @version: 
* @创建时间：2020年7月13日 下午5:22:34
* @说明: 
*/

package rsa.prime;

public class ner_rsa {
	findnum num = new findnum();
	int p = num.rsa_pq();
	int q = num.rsa_pq();
	int n = p * q;
	int r = (p - 1) * (q - 1);
	int e = num.rsa_ne(p, q);
	int d = num.rsa_nd(e, r);

	public int get_key_p() {
		return p;
	}

	public int get_key_q() {
		return q;
	}

	public int get_key_n() {
		return n;
	}

	public int get_key_e() {
		return e;
	}

	public int get_key_d() {
		return d;
	}
}
