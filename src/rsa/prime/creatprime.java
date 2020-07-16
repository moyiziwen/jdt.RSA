/**
* @author: Lindsay
* @version: 
* @创建时间：2020年7月12日 下午8:36:04
* @说明: 生成素数，保存到TXT文件中
*/

package rsa.prime;

public class creatprime {
	public int[] prime_array() {
		int[] a_prime;
		int[] b_prime;
		a_prime = new int[20];
		for (int i = 0; i < a_prime.length; i++) {
			a_prime[i] = 1;
		}

		a_prime = is_prime_1(a_prime);
		a_prime = is_prime_2(a_prime);
		b_prime = prime_print(a_prime);
		return b_prime;
	}

	public int[] prime_print(int[] a) {
		a[0] = 0;
		a[1] = 0;
		a[2] = 1;
		a[3] = 1;
		a[5] = 1;
		a[7] = 1;
		int j = 0;
		int[] b = new int[a.length];
		for (int k = 0; k < b.length; k++) {
			b[k] = 0;
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 1) {
				b[j] = i;
				j++;
			}
		}
		return b;
	}

	public int[] is_prime_2(int[] a) {
		for (int i = 3; i < a.length; i++) {
			if (a[i] == 1) {
				for (int j = 2; j * j <= i; j++) {
					if (i % j == 0) {
						a[i] = 0;
					}
				}
			}
		}
		return a;
	}

	public int[] is_prime_1(int[] a) {
		for (int i = 2; i < a.length; i++) {
			if (a[i] == 1 & i % 2 == 0) {
				a[i] = 0;
			} else if (a[i] == 1 & i % 3 == 0) {
				a[i] = 0;
			} else if (a[i] == 1 & i % 5 == 0) {
				a[i] = 0;
			} else if (a[i] == 1 & i % 7 == 0) {
				a[i] = 0;
			}
		}
		return a;
	}
}
