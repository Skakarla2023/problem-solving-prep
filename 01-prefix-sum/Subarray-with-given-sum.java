package com.skakarla.dsa.prefixsum;

public class SubarrayGivenSum {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int target = 12;
		int n = arr.length;

		int[] prefix = new int[n];
		prefix[0] = arr[0];
		for (int i = 1; i < n; i++) {
			prefix[i] = prefix[i - 1] + arr[i];
		}

		boolean found = false;
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				int sum = (i == 0) ? prefix[j] : prefix[j] - prefix[i - 1];
				if (sum == target) {
					System.out.println("Subarray found: (" + i + "," + j + ")");
					found = true;
				}
			}
		}
		if (!found) {
			System.out.println("No subarray found with sum " + target);
		}
	}
}
