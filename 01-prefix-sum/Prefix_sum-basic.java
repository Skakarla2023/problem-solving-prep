package com.skakarla.dsa.prefixsum;

public class Prefix_sum1 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int n = arr.length;

		int[] prefix_sum = new int[n];
		prefix_sum[0] = arr[0];
		for (int i = 1; i < n; i++) {
			prefix_sum[i] = prefix_sum[i - 1] + arr[i];
		}

		System.out.println("Prefix sum:");
		for (int num : prefix_sum) {
			System.out.println(num);
		}
	}
}
