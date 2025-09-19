package com.skakarla.dsa.prefixsum;

public class Range_sum_Query {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int n = arr.length;

		int[] prefix = new int[n];
		prefix[0] = arr[0];
		for (int i = 1; i < n; i++) {
			prefix[i] = prefix[i - 1] + arr[i];
		}

		int[][] queries = { { 0, 2 }, { 1, 3 }, { 2, 4 } };
		for (int[] q : queries) {
			int L = q[0], R = q[1];
			int sum = (L == 0) ? prefix[R] : prefix[R] - prefix[L - 1];
			System.out.println("Sum from " + L + " to " + R + " = " + sum);
		}
	}
}
