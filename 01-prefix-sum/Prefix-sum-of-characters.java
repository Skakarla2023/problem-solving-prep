package com.skakarla.dsa.prefixsum;

public class Prefix_Sum_of_Characters {
	public static void main(String[] args) {
		String s = "aabac";
		int n = s.length();

		int[] prefixA = new int[n];
		prefixA[0] = (s.charAt(0) == 'a' ? 1 : 0);
		for (int i = 1; i < n; i++) {
			prefixA[i] = prefixA[i - 1] + (s.charAt(i) == 'a' ? 1 : 0);
		}
		int L = 1, R = 3;
		int countA = (L == 0) ? prefixA[R] : prefixA[R] - prefixA[L - 1];
		System.out.println("Count of a from " + L + " to " + R + " = " + countA);

	}
}
