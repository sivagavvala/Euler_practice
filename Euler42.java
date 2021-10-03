package com.alg.top20.assgn1;

import java.util.*;
import java.io.*;

class Euler42 {
	
		String triangleWord(String word, int[] tri, char[] alpha) {
			int sum = 0;
			char z;
			for (int i = 0; i < word.length(); i++) {
				z = word.charAt(i);
				for (int p = 0; p < 26; p++) {
					if (z == alpha[p]) {
						int k = p + 1;
						sum = sum + k;
						break;
					}
				}
			}
			// System.out.println(sum);
			for (int m = 0; m < tri.length; m++) {
				if (sum == tri[m])
					return word;
			}
			return null;
		}

	public static void main(String args[]) throws Exception {
		int tri[] = new int[50];
		int count = 0;
		for (int i = 0; i < tri.length; i++) {
			tri[i] = ((i + 1) * (i + 2)) / 2;
		}
		char[] alpha = new char[26];
		for (int j = 65; j <= 90; j++) {
			alpha[j - 65] = (char) j;
		}
		Scanner sc = new Scanner(new File("words1.txt"));
		Euler42 obj = new Euler42();
		String find;
		while (sc.hasNext()) {
			String word = sc.next();
			find = obj.triangleWord(word, tri, alpha);
			if (find != null) {
				count++;
				System.out.println("Triangle word is " + find);
			}
		}
		System.out.println("no of triangle words : " + count);
		sc.close();
	}
}