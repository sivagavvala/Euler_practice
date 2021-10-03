package com.alg.top20.assgn1;

import java.util.*;

class Euler41 {
	int countDigit(int n) {
		ArrayList<Integer> ary = new ArrayList<Integer>();
		while (true) {
			int m = n % 10;
			ary.add(m);
			n = n / 10;
			if (n == 0)
				break;
		}
		return ary.size();
	}

	boolean uniqueFind(int i, int n) {

		int[] arr = new int[n];
		int h = 0, count = 0;
		while (true) {
			int m = i % 10;
			arr[h++] = m;
			i = i / 10;
			if (i == 0)
				break;
		}

		for (int m = 0; m < arr.length; m++) {
			for (int j = m + 1; j < arr.length; j++) {
				if (arr[m] == arr[j])
					return false;

			}
		}
		for (int k = 0; k < arr.length; k++) {
			for (int p = 1; p <= n; p++) {
				if (arr[k] == p)
					count++;
			}
		}
		if (count == n)
			return true;
		else
			return false;
	}

	void checkPrime(int i) {
		int c = 0, count = 0, need = 0;
		for (int k = 2; k <= 9; k++) {
			if (i % k == 0)
				return;
			else
				count++;
		}
		if (count == 8) {
			c = countDigit(i);
			if (uniqueFind(i, c)) {
				if (need < i)
					need = i;
				System.out.println("pandigit is " + i);
			}
		}
	}

	public static void main(String args[]) {
		Euler41 obj = new Euler41();
		for (int i = 1500000; i >= 1100; i--) {
			obj.checkPrime(i);
		}
	}
}
